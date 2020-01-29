package edu.codigocode.modelo;

import java.util.Random;

// esto es un comentario , el compilador no le de va a dar importancia

// hago un segundo comentario y lo comento con ctrl + shift + c ( shortcut)

/*
 *  esto es
 *  un comentario
 *  de multiples
 *  lineas
 */

/***
 * 
 * @author dante.panella
 * @desc es la clase donde se definen los atributos de un jugador de futbol
 * @attr nombre, numberocamiseta,posicion
 * @meth patear al arco, fingir falta, llorar en el piso, desmarcar
 * 
 *
 */
public class Jugador {

	// atributos de la clase jugador
	/*
	 * variables ---> son posiciones en memoria donde se va a estar guardando el
	 * valor asignado por el desarrollador o el usuario de la aplicacion ejemplo:
	 * nombre = "Juan";
	 * 
	 * Java es un lenguaje tipado
	 * 
	 * String ---> cadena --->
	 * 
	 * String nombre = "Juan";
	 * 
	 * int => Integer --> guardan numeros enteros 32 digitos long es un numero
	 * entero pero largo
	 * 1231231231239187231209381209381029381901928378192371928371982371893
	 * 
	 * boolean ---> verdadero o falso ---> true, false 1.732389 para puntos decimal
	 * double mejor aproximacion en . decimal float menor aproximacion en . decimal
	 * short dos digitos en . decimal
	 * 
	 */

	public String nombre = "juan";
	public String posicion;
	public int numeroCamiseta;
	public boolean veloz;
	public double altura;
	public String contexturaFisica;
	public int cantFaltas = 0;

	// Variables primitivas , variables objetos
	// String es una variable de tipo clase ( objeto ) en el cual tiene
	// funcionalidad extra
	// las variables primitivas solo guardan el valor que le asignemos

	// funcionalidad o metodos de la clase jugador ( el comportamiento)

	// metodos
	// funciones --- procedimientos

	/*
	 * Procedimientos : son metodos que no retornas un valor y ejecutan
	 * instrucciones de manera secuencial tienen visibilidad si son publicos o
	 * privados ( accedidos por la misma clase o por fuera) utilizan la palabra
	 * reservad void ( vacio) ---> solo ejecuntan instruccion de forma secuencial ej
	 * void pateoAlArco() entre parentisis van los atributos o no del procedimiento
	 * para inicializar el scope o ambito del procedimineto se pone despues del
	 * partensis una llave que abre { y donde termina la funcionalidad una llave que
	 * cierra }
	 * 
	 */
	public void pateoAlArco() {
		// el ambito de la clase
		// tengo que poner la funcionalidad

		// para mostrar por consola utilizo la clase System que tiene el metodo out el
		// sub metodo println imprimir

		System.out.println("Pateo al arco");

	}

	public void fingirFalta() {
		System.out.println("el jugador " + nombre + " posicion " + posicion);
		System.out.println("INFRACCION!");
		System.out.println(nombre + " dice - 'me toco juez me toco cobrele falta' ");
	}
//	exagerarFaltaLlorando
//	desmarcar

	public void muestroJugador() {
		System.out.println("nombre= " + nombre + ", posicion=" + posicion + ", es veloz=" + veloz);
	}

	public String esGol() {
		int presicion = new Random().nextInt(10);
		String valor;
		System.out.println("=============== PATEA AL ARCO EL JUGADOR " + nombre + " ===============");
		if (presicion < 3) {
			valor = "no es gol, burro! " + nombre;
		} else {
			valor = nombre + " hizo el  GOOOLL!!!";
		}
		return valor;
	}
}
