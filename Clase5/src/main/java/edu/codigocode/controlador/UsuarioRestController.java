package edu.codigocode.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.codigocode.dao.UsuarioDao;
import edu.codigocode.modelo.Respuesta;
import edu.codigocode.modelo.Usuario;

@RestController
public class UsuarioRestController {


	@Autowired
	private Respuesta respuesta;
	
	@Autowired
	private UsuarioDao userDato;

	@PostMapping(value = "guardoUsuario")
	public ResponseEntity guardoUsuario(@RequestBody Usuario usuario) {

		System.out.println(usuario);
		respuesta.setRespuesta("KO");
		respuesta.setStatus(500);
		respuesta.setMensaje("Error inesperado vea el log!");
		
		if(!userDato.guardoUsuario(usuario)) {
			respuesta.setRespuesta("OK");
			respuesta.setStatus(200);
			respuesta.setMensaje("El usuario se guardo correctamente en la base de datos");
			
		}


		return ResponseEntity.ok(respuesta);
	}

	@GetMapping(value = "getUsuario/{id}")
	public ResponseEntity<Usuario> DevolverUsuario(@PathVariable("id") int id) {

		
		return ResponseEntity.ok(userDato.obtenoUsuario(id));
	}

	@PostMapping(value = "validoUsuario")
	public ResponseEntity<Respuesta> validoUsuario(@RequestBody Usuario usuario) {
		respuesta.setMensaje("USUARIO O PASSWORD INCORRECTO O NO ENCONTRADO");
		respuesta.setStatus(500);
		respuesta.setRespuesta("No Tiene acceso");
		
//		this.listUsuario.forEach(user -> {
//			if (user.getNombre().contentEquals(usuario.getNombre())
//					&& user.getPassword().equals(usuario.getPassword())) {
//				respuesta.setMensaje("USUARIO ENCONTRADO");
//				respuesta.setStatus(200);
//				respuesta.setRespuesta("Tiene acceso");
//			}
//		});

		return ResponseEntity.ok(respuesta);
	}
}
