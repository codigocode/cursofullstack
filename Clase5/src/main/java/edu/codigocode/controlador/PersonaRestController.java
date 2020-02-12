package edu.codigocode.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.codigocode.modelo.Persona;

@RestController
public class PersonaRestController {

	@GetMapping(value = "/persona")
	public String devuelvoPersona() {

		Persona p = new Persona();
		p.setNombre("Magui");
		p.setApellido("Panella");
		p.setEdad(7);
		return p.devuelvoDatos();

	}

	@GetMapping(value = "/personaObjeto")
	public Persona getPersona() {
		Persona p = new Persona();
		p.setNombre("Magui");
		p.setApellido("Panella");
		p.setEdad(7);
		System.out.println(p);
		return p;
	}

	@GetMapping(value = "/datosPersonales/{nombre}/{apellido}/{edad}")
	public Persona asdasd(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido,
			@PathVariable("edad") int edad) {
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setEdad(edad);
		if(p.getEdad() > 30) {
			p.setResutaldo("Estas viejo!");
		}else {
			p.setResutaldo("Living la vida loca!");
		}
		
		return p;
	}
}
