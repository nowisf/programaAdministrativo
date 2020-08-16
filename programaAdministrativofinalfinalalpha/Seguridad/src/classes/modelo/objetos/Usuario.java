package classes.modelo.objetos;

import java.util.Date;

public class Usuario {
	int id;
	String tipo;
	String usuario;
	String contraseña;
	
	Date fecha;
	//hora

	public Usuario(int id, String tipo, String usuario, String contraseña, Date fecha) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.fecha = fecha;
	}
	
	
	
}
