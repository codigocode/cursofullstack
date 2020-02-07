package edu.codigocode.controlador;

import edu.codigocode.modelo.CuentaSueldo;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private CuentaSueldo cuentaSueldo;

	//Sobre carga de metodos y constructor
	
	/* 
	 * La sobrecarga de metodos y / o constructores, es tener el mismo nombre del metodo
	 * pero con distinta firma
	 * 
	 * public Persona(){
	 * }  UN CONSTRUCTOR VACIO
	 * 
	 * public Persona(String nombre, String apellido, String dni, CuentaSueldo cuentaSueldo){
	 * 
	 * }
	 * 
	 */
	
	
	public Persona() {} // constrcutor vacio por defecto 
	
	
	                                                           // new CuentaSueldo(5000)
	public Persona(String nombre, String apellido, String dni, CuentaSueldo cuentaSueldo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuentaSueldo = cuentaSueldo;// <---- cuentaSueldo.getSaldo() --> 5000
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



	public CuentaSueldo getCuentaSueldo() {
		return cuentaSueldo;
	}

	

}
