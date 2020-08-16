package classes.modelo.objetos;

public class ParticipantesCapacitacion {
	int idCapacitacion;
	String nombreParticipante;
	
	
	public ParticipantesCapacitacion(int idCapacitacion, String nombreParticipante) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.nombreParticipante = nombreParticipante;
	}
	
	public int getId() {
		return idCapacitacion;
	}

	public String getNombreParticipante() {
		return nombreParticipante;
	}
	
}
