package edu.codigocode.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.codigocode.modelo.Respuesta;
import edu.codigocode.modelo.Usuario;

@RestController
public class UsuarioRestController {


	@Autowired
	private Respuesta respuesta;
	
	@PostMapping(value="guardoUsuario")
	public ResponseEntity guardoUsuario(@RequestBody Usuario usuario) {
		
		System.out.println(usuario);
		
		respuesta.setRespuesta("OK");
		respuesta.setStatus(200);
		respuesta.setMensaje("El usuario se guardo correctamente en la base de datos");
		
		return ResponseEntity.ok(respuesta);
	}
}
