package edu.codigocode.modelo;

public class CuentaSueldo {

	/*
	 * LAS VARIABLES DE UNA CLASE JAMAS!!! DEBEN SER PUBLICAS SIEMPRE PERO SIMPRE
	 * DEBEN SER PRIVADAS!
	 * 
	 * Encapsulamiento: Todo atributo privado DEBE ser accedido por medio de un
	 * metodo publico
	 * 
	 */
	private double saldo;

	// creamos un constructor con el saldo inicial de la cuenta
	public CuentaSueldo() {
		this.saldo = 1000;
	}

	public CuentaSueldo(double plataACargar) {
		this.saldo = plataACargar;
	}

	public double retirarEfectivo(double cantidadARetirar) {
		System.out.println("solicito " + cantidadARetirar);

		if (saldo < cantidadARetirar) {
			System.out.println("No PUEDE RETIRAR ESE MONTO");

			System.out.println("Su saldo es de " + saldo);
			System.out.println("usted puede ritrar 1000");
			this.saldo = saldo - 1000;
			return saldo;

		}
		this.saldo = saldo - cantidadARetirar;
		return this.saldo;

	}

	// getter y setters

	// un metodo que retorne la variable saldo
	// para obtener la variable saldo
	public double getSaldo() {
		return this.saldo;
	}

	// para asignar debo crearme el metodo setter
//	public void setSaldo(double saldo) {
//
//		this.saldo = saldo;
//	}

	// un falso set acreditar saldo

	public void acreditoSaldoACuenta(double deposito) {
		this.saldo = this.saldo + deposito;
	}

}
