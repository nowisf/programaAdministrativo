package classes.modelo.objetos;

public class Actividad {
	int id;
	boolean realizado;
	String detalles;
	int idAsesoria;
	
	public Actividad(int id, boolean realizado, String detalles, int idAsesoria) {
		super();
		this.id = id;
		this.realizado = realizado;
		this.detalles = detalles;
		this.idAsesoria = idAsesoria;
	}
	
	
}
