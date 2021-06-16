package Model;

import java.util.List;

public class UnidadesEmergenciaBuilder {
	
	
	public static Ambulancia crearAmbulancia(int id, List<Trabajador> listaTrabajadors, String provinString) {
		Ambulancia ambulancia=null;
		if(listaTrabajadors.size()==3) {
			ambulancia=new Ambulancia(id, listaTrabajadors, provinString);
			
		}
		return ambulancia;
	}
	
	public static Policia crearPolicia(int id, List<Trabajador> listaTrabajadors, String provinString) {
		Policia policia=null;
		if(listaTrabajadors.size()==2) {
			policia=new Policia(id, listaTrabajadors, provinString);
			
		}
		return policia;
	}
	
	public static Bomberos crearBomberos(int id, List<Trabajador> listaTrabajadors, String provinString) {
		Bomberos bomberos=null;
		if(listaTrabajadors.size()==5) {
			bomberos=new Bomberos(id, listaTrabajadors, provinString);
			
		}
		return bomberos;
	}
}
