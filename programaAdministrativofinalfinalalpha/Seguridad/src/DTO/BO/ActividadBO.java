package DTO.BO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import classes.conexionSingleton.ConexionSingleton;

import classes.modelo.objetos.Actividad;

public class ActividadBO {
	ArrayList<Actividad> filas = new ArrayList<Actividad>();
	
	public void inicializar() {
		System.out.println("~Iniciando ActividadBO~");
		try {
			System.out.println("--Conectando");
			Connection conn = ConexionSingleton.getConnection();
			Statement sttm = conn.createStatement();
			System.out.println("--Ejecutando Query");
			ResultSet rs = sttm.executeQuery("select * from actividad");
			
			System.out.println("--Extrayendo set de resultados");
			while(rs.next()){
				filas.add(new Actividad(
						rs.getInt("ID_ACTIVIDAD"), 
						rs.getBoolean("REALIZADO"), 
						rs.getString("DETALLE_ACTIVIDAD"), 
						rs.getInt("ASESORIA_ID_ASESORIA")
						)
						);
			}
			System.out.println("--Cerrando coneccion");
			sttm.close();
			ConexionSingleton.closeConnection();
			
			System.out.println("--Completado ::)~");
		
		}catch(Exception e){
			System.out.println("Error al inicializar ActividadBO");
		}
	}
	
	public void filasToString() {
		System.out.println(filas);
	}

}