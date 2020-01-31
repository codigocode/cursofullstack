package edu.codigocode.vista;

import edu.codigocode.controlador.ActividadControlador;

public class Test {

	public static void main(String[] args) {

		// Creo un objeto de actividad controlado
		// donde doy vida a las clases que tengo

		ActividadControlador ac = new ActividadControlador();

		System.out.println("==== Actividad 1  =====");
		ac.claseDeZumba();
		System.out.println("==== Actividad 2  =====");
		ac.claseDeYoga();
		System.out.println("==== Actividad 1  =====");
		ac.claseDeBoxeo();
	}

}
