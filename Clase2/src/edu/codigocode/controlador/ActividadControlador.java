package edu.codigocode.controlador;

import edu.codigocode.modelo.Actividad;
import edu.codigocode.modelo.Profesor;
import edu.codigocode.modelo.Socio;

public class ActividadControlador {

	public void claseDeZumba() { // principio

		Profesor profeZumba = new Profesor();

		Socio[] SociosPresentes = new Socio[9];
		int capacidadClase = 8;

		profeZumba.nombre = "Tito baratito";
		profeZumba.salario = 30;

		// la actividad espera String Nombre, String objetivo, boolean precalentamiento,
		// Profesor objtProfesor
		Actividad act = new Actividad("Zumbay", "Que las personas bailen bien", false, profeZumba, SociosPresentes,
				capacidadClase); // Ya no estoy
		// utilizando el
		// constructor de
		// object sino que
		// utilizo el de la
		System.out.println("La Actividad la da " + act.profesor.nombre);// da el mismo resultado que arriba ( pero no
																		// estan interactuando los objetos)
		System.out.println(act.nombre);
		System.out.println(act.objetivo);
		System.out.println(act.precalentamiento);
		// tarea para el hogar asignar socios a la clase
		
		/* fin */}

	public void claseDeYoga() {
		Profesor profeYoga = new Profesor();
		Socio[] SociosPresentes = new Socio[3];
		int capacidadClase = 5;

		profeYoga.nombre = "Elsa quito";

		Actividad act = new Actividad("Yoga Zen", "Ganar paz interior", true, profeYoga, SociosPresentes,
				capacidadClase);
		Socio socio1 = new Socio();
		Socio socio2 = new Socio();
		Socio socio3 = new Socio();
		socio1.nombre = "Pia";
		socio2.nombre = "Claudia";
		socio3.nombre = "Rosana";

		act.asignoSocioActividad(socio1);
		act.asignoSocioActividad(socio2);
		act.asignoSocioActividad(socio3);

		System.out.println("La Actividad la da " + act.profesor.nombre);
		System.out.println(act.nombre);
		System.out.println(act.objetivo);
		System.out.println(act.precalentamiento);
		
		
		act.muestroListaDeSocio();

	}

	public void claseDeBoxeo() {
		Profesor profeBox = new Profesor();
		profeBox.nombre = "Elbio";
		Socio[] SociosPresentes = new Socio[10];
		int capacidadClase = 10;

		Actividad act = new Actividad("Boxeo recreativo", "Darse rosca", true, profeBox, SociosPresentes,
				capacidadClase);
		System.out.println("La Actividad la da " + act.profesor.nombre);
		System.out.println(act.nombre);
		System.out.println(act.objetivo);
		System.out.println(act.precalentamiento);
		
		// tarea para el hogar asignar socios a la clase
	}
}
