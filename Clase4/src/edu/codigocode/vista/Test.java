package edu.codigocode.vista;

import edu.codigocode.modelo.CuentaSueldo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaSueldo cs = new CuentaSueldo();
		//cs.saldo=10000;
		
		cs.acreditoSaldoACuenta(9000);
		
		System.out.println("su capital es de " + cs.getSaldo());
		
		System.out.println("Su saldo disponible es: " + cs.retirarEfectivo(5000.0));
		
		//cs.saldo=0; // error humano o metodo que sobre-escribe el valor del saldo
		System.out.println("La variable cs.getSaldo() es: " + cs.getSaldo());
		
		System.out.println("===========UNA EXTRACCION MAS TARDE============");
		System.out.println("Su saldo disponible es: " + cs.retirarEfectivo(2000.0));
		System.out.println("La variable cs.getSaldo() es: " + cs.getSaldo());

		System.out.println("===========Otro dia============");
		System.out.println("Su saldo disponible es: " + cs.retirarEfectivo(3000.0));
		System.out.println("La variable cs.getSaldo() es: " + cs.getSaldo());	
		
		System.out.println("===========Dia 3============");
		System.out.println("Su saldo disponible es: " + cs.retirarEfectivo(3000.0));
		System.out.println("La variable cs.getSaldo() es: " + cs.getSaldo());	
	}

}
