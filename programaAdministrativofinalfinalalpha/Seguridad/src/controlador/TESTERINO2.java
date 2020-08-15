package controlador;

import java.util.ArrayList;

import manipuladorDeLaConexionSingleton.Querificatron;

public class TESTERINO2 {

	public static void main(String[] args) {
		//ejecutar conexionSingleton
		ArrayList<String> nombreDatos = new ArrayList<String>();
		nombreDatos.add("id");
		//nombreDatos.add("\"nombre test\"");

		
		ArrayList<String> datos = new ArrayList<String>();
		datos.add("1" );
		//datos.add("nombrelete");
		
		Querificatron.insert("TABLATEST", nombreDatos, datos);

		Querificatron.obtenerTabla("TABLATEST");
		

	}

}
