package controlador;

import DTO.BO.AccidentesBO;
import DTO.BO.ActividadBO;
import DTO.BO.CapacitacionBO;
import DTO.BO.ParticipantesCapacitacionBO;
import DTO.BO.UsuarioBO;

public class TesterinoBOs {

	public static void main(String[] args) {
		ejecutarTesterinoBOs();
	}
	
	public static void ejecutarTesterinoBOs() {
		System.out.println("~~Creando BO PRUEBERINO");

		AccidentesBO BO= new AccidentesBO();
		ActividadBO BO2= new ActividadBO();
		ParticipantesCapacitacionBO BO3= new ParticipantesCapacitacionBO();
		CapacitacionBO BO4= new CapacitacionBO();
		UsuarioBO BO5= new UsuarioBO();
		
		System.out.println("--INICIALIZANDO");
		BO.inicializar();
		BO2.inicializar();
		BO3.inicializar();
		BO4.inicializar(BO3);
		BO5.inicializar();
		
		System.out.println("--TEST TO STRING");
		BO.filasToString();
		BO2.filasToString();
		BO3.filasToString();
		BO4.filasToString();
		BO5.filasToString();
	}

}
