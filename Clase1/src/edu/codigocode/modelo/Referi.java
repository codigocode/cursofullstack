package edu.codigocode.modelo;

public class Referi {

	// atributos / variable
	public String nombre;
	public String colorCamiseta;

	// Procedimiento / metodo
	// vamos a pasarle un parametro inidicando el color de la tarjeta
	public void cobrarFalta(String colorTarjeta, Jugador jugador) {
		agregoTajetaAJugador(jugador);
		System.out.println("El jugador " + jugador.nombre + " obtuvo una tarjeta de color " + colorTarjeta);
		System.out.println("el jugador " + jugador.nombre + " tiene cantidad de faltas " + jugador.cantFaltas);
		
	}

	public void agregoTajetaAJugador(Jugador jugador) {
		jugador.cantFaltas = jugador.cantFaltas+1;
		
		//verificamos si tiene mas de 2 faltas amillas es roja directa
		if(jugador.cantFaltas == 2) {
			// si es verdadero se ejecuta este bloque
			System.out.println("no puede seguir jugando el jugador " + jugador.nombre);
		}else {
			// si es falso se ejecuta este otro bloque
			System.out.println("puede seguir jugando pero con cuidado");
		}
		
		
		
	}
	
	public void finPartido() {
		System.out.println("fin del partido");
	}
}
