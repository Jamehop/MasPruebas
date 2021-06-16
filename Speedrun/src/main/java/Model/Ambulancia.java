package Model;

import java.util.List;

public class Ambulancia extends UnidadesEmergencia implements SistemaEmergencias{

	public Ambulancia(int id, List<Trabajador> trabajadores, String provinciaString) {
		super(id, trabajadores, provinciaString);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String llamadaEmergencia(TipoEmergencia te, String provincia) {
		// TODO Auto-generated method stub
		if(provinciaString.equals(provincia)&&
				(te.equals(TipoEmergencia.TRAFICO)||te.equals(TipoEmergencia.CASERO)||te.equals(TipoEmergencia.INCENDIO))) {
			System.out.print("##Unidad "+this.id+" de Ambulancia en la provincia de "+this.provinciaString+" en camino!");
		}
		return null;
	}

	
}
