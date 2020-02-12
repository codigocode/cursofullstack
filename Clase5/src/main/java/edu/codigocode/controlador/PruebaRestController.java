package edu.codigocode.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Anteponiendo una anotacion ej ( @RestController en una clase) 
 * utilizamos le patron de diseño decorator
 * y efectua una ejecucion de 3 tipos posibles
 *   > pre ejecucion
 *   > ejecucion
 *   > pos ejecucion
 */

@RestController
public class PruebaRestController {

	@GetMapping(value="/infoPagina")
	public String saludo() {
		return "Hola desde una API REST";
	}
	
}
