package DTO.BO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import classes.conexionSingleton.ConexionSingleton;

import classes.modelo.objetos.Capacitacion;

public class CapacitacionBO {
	ArrayList<Capacitacion> filas = new ArrayList<Capacitacion>();
	
	public void inicializar(ParticipantesCapacitacionBO PCBO) {
		System.out.println("~Iniciando CapacitacionBO~");
		try {
			System.out.println("--Conectando");
			Connection conn = ConexionSingleton.getConnection();
			Statement sttm = conn.createStatement();
			System.out.println("--Ejecutando Query");
			ResultSet rs = sttm.executeQuery("select * from capacitacion");
			
			System.out.println("--Extrayendo set de resultados");
			while(rs.next()){
				
				int id = rs.getInt("id_capacitacion");
				
				ArrayList<String> participantes= PCBO.getForId(id);
				
				
				filas.add(new Capacitacion(
						rs.getInt("id_capacitacion"),
						rs.getDate("FECHA_CAPACITACION"),
						participantes,
						rs.getString("tema"), 
						rs.getInt("ACTIVIDAD_ID_ACTIVIDAD")
						)
						);
			}
			System.out.println("--Cerrando coneccion");
			sttm.close();
			ConexionSingleton.closeConnection();
			
			System.out.println("--Completado ::)~");
		
		}catch(Exception e){
			System.out.println("Error al inicializar CapacitacionBO");
		}
	}
	
	public void filasToString() {
		System.out.println(filas);
	}

}