package edu.codigocode.modelo;

public class Actividad {

	// variables globales a la clase
	public String nombre;
	public String inicioFinActividad;
	public String diasActividad; // cambiamos en breve
	public String objetivo; // cambiaremos en breve
	public boolean precalentamiento;
	public Socio[] listaSocio;
	public Profesor profesor;
	public int limiteActividad;
	public int contSocio = 0; // este va a ser mi indice de socios

	// Constructores
	// Jugador j1 = new Jugador(); ?? <---

	/*
	 * El constructor de una clase es el punto de inicializacion de la misma podemos
	 * pasarle o no parametros normalmente es con la visibilidad public ( en algunos
	 * casos puede variar) DEBE TENER EL MISMO NOMBRE DE LA CLASE y puede o no
	 * aceptar parametros de entrada public Actividad(String nombre, Socio socio)
	 * ej2 public Actividad()
	 */

	// variables locales al metodo o al constructor
	public Actividad(String nombre, String objetivo, boolean precalentamiento, Profesor profesor,
			// arreglos o vectores de objetos
			Socio[] listaSocio, int limiteActividad) {

		// hardCode ---> poner el codigo en duro o caliente
		this.nombre = nombre;
		this.objetivo = objetivo;
		this.precalentamiento = precalentamiento;
		this.profesor = profesor;
		this.listaSocio = listaSocio;
		this.limiteActividad = limiteActividad;

	}

	// generamos un metodo donde pregntamos si hay capacidad para la actividad
	// si hay capacidad asignamos el socio a la actividad

	public void asignoSocioActividad(Socio socio) {

		if (limiteActividad >= listaSocio.length) {
			System.out.println("La capacidad de esta clase es de " + limiteActividad);
			// no queremos llenar el vector con el mismo socio
			listaSocio[contSocio] = socio;
			contSocio = contSocio + 1;
			System.out.println("Se asigno correctamente el socio " + socio.nombre + " la actividad " + nombre);
		} else {
			System.out.println("No se puede asignar el socio a la actividad porque el cupo esta lleno");
		}

	}

	public void muestroListaDeSocio() {

		System.out.println("La actividad es " + nombre + " con capacidad de " + limiteActividad + " de socios ");
		System.out.println("asistieron : ");
		for (int i = 0; i < listaSocio.length; i++) {

			// para verificar que una posicion no sea nula debemos comprobar si esta ocupada
			// o inicializada
			if (listaSocio[i] != null) {   // cuando quiero comparar es con ==  ( doble igual ) si quiero saber si es distinto es con != , < o el otro >    && -- || 
				System.out.println(listaSocio[i].nombre); 
				// si nuestro vector ocupamos el total de los espacios en  memoria
				// no nos daria un error ej: [ obj1,obj2,null ]
				// obj1.nombre, obj2.nombre, null.nombre

			}

		}
	}

}
