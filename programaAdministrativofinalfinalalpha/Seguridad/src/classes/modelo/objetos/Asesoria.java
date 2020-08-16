package classes.modelo.objetos;

import java.util.Date;

public class Asesoria {
	int id;
	Date fechaSolicitud;
	boolean completado;
	int idCliente;
	int idProfesional;
	
	public Asesoria(int id, Date fechaSolicitud, boolean completado, int idCliente, int idProfesional) {
		super();
		this.id = id;
		this.fechaSolicitud = fechaSolicitud;
		this.completado = completado;
		this.idCliente = idCliente;
		this.idProfesional = idProfesional;
	}
	
	
}
