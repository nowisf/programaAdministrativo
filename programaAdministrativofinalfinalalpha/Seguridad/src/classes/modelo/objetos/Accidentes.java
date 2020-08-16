package classes.modelo.objetos;

import java.util.Date;

public class Accidentes {
	int id;
	int idCliente;
	Date fecha;
	String involucrado;
	String lugar;
	String actividad;
	String descripcion;
	
	public Accidentes(int id, int idCliente, Date fecha, String involucrado, String lugar, String actividad,
			String descripcion) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.involucrado = involucrado;
		this.lugar = lugar;
		this.actividad = actividad;
		this.descripcion = descripcion;
	}
	
}
