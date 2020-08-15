package manipuladorDeLaConexionSingleton;

import classes.conexionSingleton.ConexionSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Querificatron{
	
	public static void obtenerTabla(String tabla) {
		try {

			Connection coneccion = ConexionSingleton.getConnection();
			Statement declaracion = coneccion.createStatement();
			ResultSet rs=declaracion.executeQuery("select * from "+tabla);
			

			//System.out.println(rs.findColumn("nombre"));
			

			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
			}
			coneccion.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public static void insert(String tabla, ArrayList<String> nombreDeLosValoresIntroducidos, ArrayList<String> valoresIntroducidos) {
		try {

			Connection coneccion = ConexionSingleton.getConnection();
			Statement declaracion = coneccion.createStatement();
			
			String queryInsert = "INSERT INTO "+tabla+" (";
			
			for (String elemento: nombreDeLosValoresIntroducidos) {
				queryInsert += elemento+", ";

			}

			queryInsert = queryInsert.substring(0,queryInsert.length()-2) + ") VALUES (";
			
			for (String elemento: valoresIntroducidos) {
				queryInsert += elemento+", ";
			}
			queryInsert = queryInsert.substring(0,queryInsert.length()-2) + ")" ;
			
			System.out.println(queryInsert);

			declaracion.execute(queryInsert);
			
			coneccion.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	
	
	
}
