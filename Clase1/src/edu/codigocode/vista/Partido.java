package edu.codigocode.vista;

import edu.codigocode.modelo.Consumer;
import edu.codigocode.modelo.Jugador;
import edu.codigocode.modelo.Referi;

public class Partido {

//		main  + control +espacio .... enter
	public static void main(String[] args) {
		// si quieren ejecutar el codigo por medio de un shortcut es con alt + shift + x
		// ... j
		// para poner system.out.println de forma rapita es escribiendo syso + ctrl +
		// espacio

		System.out.println("Hola mundo");

		System.out.println("fin del partido");

		// crearnos un objeto de tipo Referi o/ y jugador

		String nombre = "pepita";

		System.out.println("el nombre de la persona es " + nombre); // es la concatenacion la union de dos variables
																	// idealmente de tipo string

		int num1 = 2;
		int num2 = 2;
		// no se da concatencion sino una operacion aritmetica con dos enteros ejemplo
		System.out.println("El resultado de 2+2 = " + (num1 + num2));

		// String nombre= "fulana";
		// nos creamos el objeto de tipo Jugador por medio de la palabra reservada new
		Jugador j1 = new Jugador(); // poner los partensis al final de la clase ejemplo new Jugador()
		Jugador j2 = new Jugador();
		// nos creamos un objeto de tipo referi
		Referi ref1 =new Referi();

		j1.nombre = "enzo";
		j1.posicion = "delantero";
		j1.veloz = true;

		j2.nombre = "lio";
		j2.posicion = "defensor";
		j2.veloz = true;
		
		ref1.nombre="Castrilli";

		// utilizo el metodo de mostrar los atributos del jugador
		j1.muestroJugador();
		j2.muestroJugador();

		System.out.println("inicia el partido....");
		
//		int pres2 = j2.pateoAlArcoPresicion();
		System.out.println(j1.esGol());
		
		j1.fingirFalta();
		ref1.cobrarFalta("amarillo",j1);
		System.out.println("======= paso tiempo en el partido ========");
		System.out.println("INFRACCION!!!!");
		
		System.out.println(j2.esGol());
		ref1.cobrarFalta("roja", j2);
		System.out.println("========================");
		
		ref1.cobrarFalta("roja", j1);
		
		
		Consumer<String> c1 =  s -> System.out.println("C1 " + s);
		Consumer<String> c2 =  s -> System.out.println("C2 " + s);
		
		Consumer<String> c3 =  s -> {
			c1.accept(s);
			c2.accept(s);
		};
		
		c3.accept("hola mundo");

		
		

	}

}





