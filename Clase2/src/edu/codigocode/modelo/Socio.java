package edu.codigocode.modelo;

public class Socio {

	public String nombre;
	public int numSocio;
	public double cuota;
	public boolean vencimiento; // verdadero o falso
	public boolean actoFisico; // verdadero o falso
	public int habilidad;
	
	
	public void pagar() {
		System.out.println("pago la cuota");
	}
	
}
