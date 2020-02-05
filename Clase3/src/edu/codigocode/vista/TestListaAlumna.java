package edu.codigocode.vista;

import java.util.ArrayList;

import edu.codigocode.modelo.Alumna;

public class TestListaAlumna {

	public static void main(String[] args) {

		// creo una lista de tipo alumnas

		ArrayList<Alumna> listaAlumnas = new ArrayList<Alumna>();

		listaAlumnas.add(new Alumna("Jimena", "perez", 30));
		listaAlumnas.add(new Alumna("MeLy", "de Nieto", 23));
		listaAlumnas.add(new Alumna("pIa", "Nieto", 15));
		listaAlumnas.add(new Alumna("ALBANO", "rodriguez", 35));

		// foreach Java8
		listaAlumnas.forEach(itemAlumna -> itemAlumna.muetroDatos());
		
	

	}

}
