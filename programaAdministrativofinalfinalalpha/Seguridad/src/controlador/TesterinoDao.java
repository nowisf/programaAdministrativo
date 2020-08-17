package controlador;

import java.util.Calendar;
import java.util.Date;

import advancesIqtools.Datetron;
import classes.modelo.dao.UsuarioDaoImp;
import classes.modelo.objetos.Usuario;


public class TesterinoDao {

	public static void main(String[] args) {
		UsuarioDaoImp hola = new UsuarioDaoImp();
		
		Calendar test= Datetron.dateToCalendario(new Date());
		
		
		//int id, String tipo, String usuario, String contraseña, Date fecha
		
		//Usuario usuarioTest = new Usuario(0, "cliente", "Nowis", "buenastardes", new Date());
		
		
		//hola.insert(usuarioTest);
		

	}

}
