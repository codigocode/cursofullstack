package edu.codigocode.vista;

import java.util.ArrayList;

public class TestLista {

	public static void main(String[] args) {

		ArrayList<String> listaString = new ArrayList<String>(); // ´porque estamos trabajo con una clase

		listaString.add("dante");
		listaString.add("claudia");
		listaString.add("Kievin");
		listaString.add("Mely");
		listaString.add("Natalia");
		listaString.add("RosAnA");
		listaString.add(1, "Santino");

		// Java 8 + Lambda
		listaString.forEach(item -> {
			if (item == "claudia") {
				System.out.println("** Efectivamente estamos accediendo al usuario de claudia **");
			}
			//la clase String tiene una propiedad llamada toLowerCase() ---> "CuAlQuIER" palabra en minuscula ej "cualiquier"
			if(item.toLowerCase().equals("rosana")) {
				
				System.out.println("Rosana");
				/*
				 * EN los condicionales el doble == compara exactamente el valor
				 * ObjetoListString = String ( NOOO) 
				 * cuando tenemos un obj -->
				 * Lista ---> la lista contiene String
				 * Lista.get(indicie) --> String . toLowerCase() == ""
				 * equals compara el valor + objeto 
				 * 
				 */
				System.out.println("Trabaja en flutter!");
			}
		});

	}

}
