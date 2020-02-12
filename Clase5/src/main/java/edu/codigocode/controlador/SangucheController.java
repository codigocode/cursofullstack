package edu.codigocode.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.codigocode.modelo.Sanguche;

@RestController
public class SangucheController {

	@GetMapping(value="armaTuSanguche/{ingrediente1}/{ingrediente2}/{ingrediente3}")
	public Sanguche createTuSangucheConLosIngredientesQueSeTeCante(
			@PathVariable("ingrediente1") String ing1,
			@PathVariable("ingrediente2")String ing2,
			@PathVariable("ingrediente3")String ing3) {
		
		
		
		
		return new Sanguche(ing1, ing2, ing3);
	}
}
