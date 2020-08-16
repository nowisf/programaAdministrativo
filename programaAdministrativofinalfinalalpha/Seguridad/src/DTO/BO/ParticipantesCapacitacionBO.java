package DTO.BO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import classes.conexionSingleton.ConexionSingleton;

import classes.modelo.objetos.ParticipantesCapacitacion;

public class ParticipantesCapacitacionBO {
	ArrayList<ParticipantesCapacitacion> filas = new ArrayList<ParticipantesCapacitacion>();
	
	public void inicializar() {
		System.out.println("~Iniciando ParticipantesCapacitacionBO~");
		try {
			System.out.println("--Conectando");
			Connection conn = ConexionSingleton.getConnection();
			Statement sttm = conn.createStatement();
			System.out.println("--Ejecutando Query");
			ResultSet rs = sttm.executeQuery("select * from Participantes_Capacitacion");
			
			System.out.println("--Extrayendo set de resultados");
			while(rs.next()){
				filas.add(new ParticipantesCapacitacion(
						rs.getInt("id_capacitacion"),
						rs.getString("nombre_participante")
						)
						);
			}
			System.out.println("--Cerrando coneccion");
			sttm.close();
			ConexionSingleton.closeConnection();
			
			System.out.println("--Completado ::)~");
		
		}catch(Exception e){
			System.out.println("Error al inicializar ParticipantesCapacitacionBO");
		}
	}
	
	public void filasToString() {
		System.out.println(filas);
	}
	
	public ArrayList<String> getForId(int idCapacitacion){
		ArrayList<String> resultado = new ArrayList<String>();
		
		for (ParticipantesCapacitacion pc:filas) {
			if(pc.getId()==idCapacitacion) {
				resultado.add(pc.getNombreParticipante());
			}
		}
		
		return resultado;
		
	}

}