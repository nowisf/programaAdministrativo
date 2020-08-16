package DTO.BO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import classes.conexionSingleton.ConexionSingleton;

import classes.modelo.objetos.Asesoria;

public class AsesoriaBO {
	ArrayList<Asesoria> filas = new ArrayList<Asesoria>();
	
	public void inicializar() {
		System.out.println("~Iniciando Asesoria~");
		try {
			System.out.println("--Conectando");
			Connection conn = ConexionSingleton.getConnection();
			Statement sttm = conn.createStatement();
			System.out.println("--Ejecutando Query");
			ResultSet rs = sttm.executeQuery("select * from asesoria");
			
			System.out.println("--Extrayendo set de resultados");
			while(rs.next()){
				filas.add(new Asesoria(
						rs.getInt("ID_ASESORIA"),
						rs.getDate("FECHA_SOLICITUD"),
						rs.getBoolean("ESTADO_ASESORIA"),
						rs.getInt("CLIENTE_ID_CLIENTE"),
						rs.getInt("PROFESIONAL_ID_PROFESIONAL")
						)
						);
			}
			System.out.println("--Cerrando coneccion");
			sttm.close();
			ConexionSingleton.closeConnection();
			
			System.out.println("--Completado ::)~");
		
		}catch(Exception e){
			System.out.println("Error al inicializar Asesoria");
		}
	}
	
	public void filasToString() {
		System.out.println(filas);
	}

}