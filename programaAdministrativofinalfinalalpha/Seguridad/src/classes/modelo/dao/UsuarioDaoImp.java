package classes.modelo.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import DTO.BO.UsuarioBO;
import classes.modelo.objetos.Usuario;
import manipuladorDeLaConexionSingleton.Querificatron;

public class UsuarioDaoImp {
	
	public void insertUsuario(Usuario usuario) {
		ArrayList<String> nombreDatos = new ArrayList<String>();
		ArrayList<String> datos = new ArrayList<String>();
		
		nombreDatos.add("ID_USUARIO");
		nombreDatos.add("TIPO");
		nombreDatos.add("USUARIO");
		nombreDatos.add("PASSWORD"); 
		
		datos.add(String.valueOf(usuario.getId()));
		datos.add("'"+ usuario.getTipo() +"'");
		datos.add("'"+ usuario.getUsuario() +"'");
		datos.add("'"+ usuario.getContraseña() +"'");
				
		//datos.add("TO_DATE('10-ene-6 12:56','DD-MON-YY HH:MI')" );	
		
		System.out.println("\n\n\n\n\n\n\n Iniciando proceso de querificacion");
		Querificatron.insert("USUARIO", nombreDatos, datos);
		
	}
	
	public void agregarUsuario(int id, String tipo, String usuario, String contraseña, UsuarioBO bo) {
		Usuario nuevoUsuario = new Usuario(id, tipo, usuario, contraseña);
		insertUsuario(nuevoUsuario);
		bo.agregarFila(nuevoUsuario);
		
	}
	
	

}
