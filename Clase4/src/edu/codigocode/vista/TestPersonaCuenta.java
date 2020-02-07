package edu.codigocode.vista;

import edu.codigocode.controlador.Persona;
import edu.codigocode.modelo.CuentaSueldo;

public class TestPersonaCuenta {

	public static void main(String[] args) {

		
		/*
		 * Ejemplo de interaccion entre clases utilizando un constrcutor vacio
		 */
		Persona p1 = new Persona();
		
		p1.setNombre("Kevin");
		p1.setApellido("Parentti");
//		p1.setDni("CO123456");
		
		CuentaSueldo cs= new CuentaSueldo();
		cs.acreditoSaldoACuenta(1000);
//		p1.setCuentaSueldo(cs);
		
		System.out.println("El varlor inicial de "+ p1.getNombre() + " es " + p1.getCuentaSueldo().getSaldo());
		System.out.println(p1.getNombre() + " va a retirar " + p1.getCuentaSueldo().retirarEfectivo(1000));
		
		System.out.println(p1.getNombre() + " verifica s saldo , es de " + p1.getCuentaSueldo().getSaldo());

	}

}
