package classes.modelo.objetos;

import java.util.Date;

public class Usuario {
	int id;
	String tipo;
	String usuario;
	String contrase�a;
	
	Date fecha;
	//hora

	public Usuario(int id, String tipo, String usuario, String contrase�a, Date fecha) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.fecha = fecha;
	}
	
	
	
}
