package edu.codigocode.vista;

import java.util.Date;
import java.util.function.Consumer;

import edu.codigocode.controlador.Persona;
import edu.codigocode.file.GuardarError;
import edu.codigocode.modelo.CuentaSueldo;

public class TestCuentaSueldoCons {

	public static void main(String[] args) {

		try {

			Persona p1 = new Persona("Natalia", "N/A", "hjgjhjhhj", new CuentaSueldo(5000));
			System.out.println("Nombre " + p1.getNombre());
			System.out.println("Apellido " + p1.getApellido());
			System.out.println("Averiguamos el apellido");

			p1.setApellido("Tocci");
			System.out.println("Apellido " + p1.getApellido());

			System.out.println("La clienta " + p1.getNombre() + " con saldo " + p1.getCuentaSueldo().getSaldo());

			System.out.println("Le queda en cuenta:  " + p1.getCuentaSueldo().retirarEfectivo(4000));
			System.out.println(" El sado de  " + p1.getNombre() + " es de " + p1.getCuentaSueldo().getSaldo());
			System.out.println(p1); // una posicion de memoria donde se aloja toda la data que le cargue
			p1 = null; // destruccion del objeto

			System.out.println(p1.getNombre());
		} catch (Exception e) {
			// muestro al usuario que ocurrio
			System.out.println("HUBO UN ERROR INTNETE MAS TARDE");
			
			// que ejecute cuando fue el error con el objeto new Date()
			GuardarError.guardoErrores(" Otro tipo de mensaje " + new Date());
			
			
			
			// muestro al desarrollador cuales fueron los pasos del error
			//e.printStackTrace();
		}
		System.out.println("FIN PROGRAMA!");
		
		Consumer<String> c1 = s->System.out.println("c1 " + s);
		Consumer<String> c2 = s->System.out.println("c2 " + s);
		
		
		Consumer<String> c3 = c1.andThen(c2);
		
		c3.accept("hola mundo");
//		System.out.println("fin");
	}

}
