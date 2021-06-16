package Model;

import java.util.List;

public class Bomberos extends UnidadesEmergencia implements SistemaEmergencias{

	public Bomberos(int id, List<Trabajador> trabajadores, String provinciaString) {
		super(id, trabajadores, provinciaString);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String llamadaEmergencia(TipoEmergencia te, String provincia) {
		// TODO Auto-generated method stub
		return null;
	}

}
