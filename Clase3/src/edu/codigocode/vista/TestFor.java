package edu.codigocode.vista;

public class TestFor {

	
	public static void main(String[] args) {
		// if switch for while do while --->  + listas  ´+ vectores
		
		String nombre ="kevin";
		String nombre2="Claudia";
		String nombre3="Albano";
		String nombre4="Santiago";
		
		System.out.println(" IMPRIMIOS VARIABLE X VARIABLE nombre, nombre2, nombre3, nombre4");
		System.out.println(nombre);
		System.out.println(nombre2);
		System.out.println(nombre3);
		System.out.println(nombre4);
		
		//VECTORES TENIAN POSICIONES LIMITADAS O ESPACIO EN MOMERIA
	
		/*
		 * Cuando se inicializa un vector no se inicializa como una clase  ej Persona p = new Persona() <<-- Constructor
		 * En el vector El tipo clase + variable = new Tipo de clase [ longitud ]
		 * ej Clase variable = new Clase[longitud];
		 */
		String[] listaNombres = new String[5]; // 0 1 2 3 
		
		listaNombres[0] = nombre;
		listaNombres[1] = "Claudia";
		listaNombres[2] = nombre3;
		listaNombres[3] = nombre4;
		listaNombres[4] = "Magico";
		
		System.out.println("==== IMPRIMIOS SOLO LA VARIABLE listaNombre[0] listaNombre[1] listaNombre[2]  listaNombre[3]============");		
		
		System.out.println(listaNombres[0]);
		System.out.println(listaNombres[1]);
		System.out.println(listaNombres[2]);
		System.out.println(listaNombres[3]);
				
		// bucles , for , while , dowhile
		// desde la posicion 0 ; itera  cuando index sea menor a  4 ; e incrementa la variable index ++ ( index = index +1)
		   //            Si es verdadero se ejecuta el bloque
		                  // 4 < 4  ---> NO !
		
		System.out.println("inicio del for");
		for(int index=0; index <  listaNombres.length; index++) {
			// aqui se va a repetiro N veces como la longitud de nuestro vector
			System.out.println("la variable index es : " + index);
			// preguntamos si el objeto no es nulo
			index++;
			if(index < listaNombres.length) { // 
 				// este bloque solo se ejecuta si es verdadero
				System.out.println(listaNombres[index]);
				
			}else {
				// este bloque se ejecuta si es falso
				System.out.println("no existe la posicion de memoria no muetro nada");
			}
			
		}
		System.out.println("fin del for!");
				
//		int[] listaPrimito = new int[10];   // El primitivo solo aloja espacios en memoria de lo que fue creado
//		
//		listaPrimito.
//		// es convenite  que trabajen con las clases
//		// ej
//		Integer[] listaEnteros = new Integer[10];
//		listaEnteros.
		
//		Persona[] nombrevariable = new Persona[longitud];
		
		
	}

}
