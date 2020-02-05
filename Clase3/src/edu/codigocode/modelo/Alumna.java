package edu.codigocode.modelo;

/*
 * Cada vez que se instancie un new Alumna("Jimena","Perez",30);
 * new Alumna("Marcela","Lopez",53); 
 */
public class Alumna {

	// variables globales
	public String nombre;
	public String apellido;
	public int edad;

	// definimos en la clase un constructor

	public Alumna(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void estudia() {

		switch (this.nombre.toLowerCase()) {
		case "pia":
			System.out.println("Falto a la clase x ir a ver a velez");
			break;
		case "mely":
			System.out.println("Cubre a la hija en la clase, aunque la mando al muere");
			break;
		case "albano":
			System.out.println("estrena nuevo sexo");
			break;
		default:
			System.out.println("No encontramos la alumna en la nomina");
			break;
		}
		System.out.println("nombre: " + this.nombre + ", estudio en la casa");
	}

	public void muetroDatos() {
		System.out.println("nombre: " + this.nombre);
		System.out.println("apellido: " + this.apellido);
		System.out.println("edad: " + this.edad);
		System.out.println("===========================");
		this.estudia();
		System.out.println("===========================");
	}
}
