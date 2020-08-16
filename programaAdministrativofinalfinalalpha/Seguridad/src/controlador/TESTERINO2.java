package controlador;

import java.util.ArrayList;
import java.util.Calendar;

import manipuladorDeLaConexionSingleton.Querificatron;

public class TESTERINO2 {

	public static void main(String[] args) {
		
		ArrayList<String> nombreDatos = new ArrayList<String>();
 
		nombreDatos.add("id");
		nombreDatos.add("palabra1");
		nombreDatos.add("fecha");

		
		ArrayList<String> datos = new ArrayList<String>();

		datos.add("'4321423'" );
		datos.add("'fdsdfssdfa'" );
		datos.add("TO_DATE('10-ene-6 12:56','DD-MON-YY HH:MI')" );	
		



		System.out.println("iniciandoInsertronicada");
		Querificatron.insert("test1", nombreDatos, datos);
		

		System.out.println("Iniciando test obtener tabla	");
		Querificatron.obtenerTabla("test1");
		
		

	}	

}
