package classes.modelo.objetos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import advancesIqtools.Datetron;;

public class Usuario {
	int id;
	String tipo;
	String usuario;
	String contraseña;	

	public Usuario(int id, String tipo, String usuario, String contraseña) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.usuario = usuario;
		this.contraseña = contraseña;
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
	public String getContraseña() {
		return contraseña;
	}

}
