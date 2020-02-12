package edu.codigocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App  // donde tengan el main 
{
    public static void main( String[] args )  // recibe de factores extenos atributos y 
    // se ejecutan dentro del mailn 
    {
    	
    	// La instruccion para poder inicializar Spring
    	SpringApplication.run(App.class, args);

    }
}
