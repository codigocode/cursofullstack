package edu.codigocode.controlador;

import java.util.ArrayList;

import edu.codigocode.modelo.Auto;
import edu.codigocode.modelo.Persona;

public class ConducirControlador {

	public void conducir() {

		Persona p1 = new Persona("Rogelio", "perez", 17);
		Persona p3 = new Persona("Ema", "Miranda", 25);
		Persona p4 = new Persona("jorge", "Lala", 45);
		Auto autito1 = new Auto("Fiat", "147", new Persona("Rogelio", "perez", 17));

		Auto autito2 = new Auto("Vw", "Suran", new Persona("Ema", "Miranda", 25));


		autito1.conduir(p1);
		autito1.velMaxima();
		
		System.out.println("la persona p4 pregunta si el auto esta disponible");
		if(autito1.estaDisponible()) {
			System.out.println("el  objeto p4 va a subirse al auto");
			 autito1 = new Auto("Fiat", "147", p4);
			 autito1.conduir(p4);
		}
		
		
		System.out.println("Intento usar el auto Numero UNO --> 2 veces ");
		autito1.usarAuto();
		
		
		
		
		System.out.println("=============");
		autito2.conduir(p3);
		autito2.velMaxima();



	}
}
