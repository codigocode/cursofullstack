package edu.codigocode.file;

import java.io.File;
import java.io.FileWriter;

public class GuardarError {

	// Sobre carga
	
	// el metodo estatico , se aloja en la misma posicion de memoria en todo el ciclo de vida
	// de nuestra aplicacion
	// no es necesario generar instanacias de objeto ej : GuardarError ge = new GuardarError() <---- ESTO NO HACE FALTA
	// GuardarError.guardoErrores("mi mensaje");
	public static void guardoErrores(String mensaje) {
		try {
			FileWriter fw = new FileWriter(new File("log.txt"),true); // creo el archivo o verifico si existe y si existe agrego los valores
			fw.write(mensaje + "\r"); // escribo el valor en el archivo
			fw.flush(); // guardo los valores
			fw.close(); // cierro el archivo
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void guardoErrores(Exception mensaje) {
		try {
			FileWriter fw = new FileWriter(new File("log.txt"),true); // creo el archivo o verifico si existe y si existe agrego los valores
			fw.write(mensaje.getMessage()); // escribo el valor en el archivo
			fw.flush(); // guardo los valores
			fw.close(); // cierro el archivo
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
