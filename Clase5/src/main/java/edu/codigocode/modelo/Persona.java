package edu.codigocode.modelo;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private String resutaldo;
	

	public String getResutaldo() {
		return resutaldo;
	}

	public void setResutaldo(String resutaldo) {
		this.resutaldo = resutaldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String devuelvoDatos() {

		return "nombre : " + this.nombre + ", apellido: " + this.apellido + ", edad: " + this.edad;
	}
	

}
