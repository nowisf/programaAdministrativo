package classes.modelo.objetos;

import java.util.Date;
import java.util.ArrayList;

public class Capacitacion {
	int id;
	Date fecha;
	ArrayList<String> participantes; //Nombre completo de cada prticipante
	String tema;
	int idActividad;
	public Capacitacion(int id, Date fecha, ArrayList<String> participantes, String tema, int idActividad) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.participantes = participantes;
		this.tema = tema;
		this.idActividad = idActividad;
	}
	
	
}
