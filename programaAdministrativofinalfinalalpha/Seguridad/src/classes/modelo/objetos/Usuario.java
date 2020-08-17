package classes.modelo.objetos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import advancesIqtools.Datetron;;

public class Usuario {
	int id;
	String tipo;
	String usuario;
	String contrase�a;	

	public Usuario(int id, String tipo, String usuario, String contrase�a) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}
	public int getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}

}
