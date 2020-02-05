package edu.codigocode.modelo;

public class Auto {

	public Persona persona;
	public String marca;
	public String modelo;
	public boolean enUso=false;

	public Auto(String marca, String modelo, Persona persona) {
		this.marca = marca;
		this.modelo = modelo;
		this.persona = persona;
	}
	
	public boolean estaDisponible() {
		return this.enUso;
	}
	
	public void usarAuto() {
		if(!enUso) { // si antepongo un ! ( singo de admiracion ) niego la sentencia
			System.out.println("puede usar el auto");
			this.enUso=true;
		}else {
			System.out.println("este auto no se puede usar");
		}
	}

	public void conduir(Persona persona) {
		System.out.println("el conductor/a :" + this.persona.nombre);
		if (persona.edad < 18) {
			System.out.println("no puede conduir");
			System.out.println("EL VEHICULO ESTA LIBRE");
			this.enUso=false;
		} else if (persona.edad >= 18) {
			System.out.println("Si puede conducir!");
		}
	}

	public void velMaxima() {
		System.out.println("el conductor/a :" + this.persona.nombre);
		System.out.println("Con el vehiculo marca: " + this.marca + ", modelo:" + this.modelo);
		if (this.persona.edad <= 30 && this.persona.edad >= 18) {
			System.out.println("La velocidad maxima que puede ir es de 150KM");
		} else if (this.persona.edad > 70) {
			System.out.println("No puede superar los 70 KM por hora");
		} else {
			System.out.println("puede manejar libremente");
		}
	}
}
