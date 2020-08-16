package DTO.BO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import classes.conexionSingleton.ConexionSingleton;

import classes.modelo.objetos.Accidentes;

public class AccidentesBO {
	ArrayList<Accidentes> filas = new ArrayList<Accidentes>();
	
	public void inicializar() {
		System.out.println("~Iniciando AccidentesBO~");
		try {
			System.out.println("--Conectando");
			Connection conn = ConexionSingleton.getConnection();
			Statement sttm = conn.createStatement();
			System.out.println("--Ejecutando Query");
			ResultSet rs = sttm.executeQuery("select * from accidentes");
			
			System.out.println("--Extrayendo set de resultados");
			while(rs.next()){
				filas.add(new Accidentes(
						rs.getInt("ID_ACCIDENTE"),
						rs.getInt("CLIENTE_ID_CLIENTE"),
						rs.getDate("FECHA_ACCIDENTE"),
						rs.getString("INVOLUCRADO"),
						rs.getString("LUGAR"),
						rs.getString("ACTIVIDAD"),
						rs.getString("DESCRIPCION")
						)
						);
			}
			System.out.println("--Cerrando coneccion");
			sttm.close();
			ConexionSingleton.closeConnection();
			
			System.out.println("--Completado ::)~");
		
		}catch(Exception e){
			System.out.println("Error al inicializar AccidentesBO");
		}
	}
	
	public void filasToString() {
		System.out.println(filas);
	}

}
