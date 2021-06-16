package Model;

import java.util.List;

public abstract class UnidadesEmergencia implements SistemaEmergencias{
	public int id;
	public List<Trabajador> trabajadores;
	public String provinciaString;
	
	public UnidadesEmergencia(int id, List<Trabajador> trabajadores, String provinciaString) {
		super();
		this.id = id;
		this.trabajadores = trabajadores;
		this.provinciaString = provinciaString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public String getProvinciaString() {
		return provinciaString;
	}

	public void setProvinciaString(String provinciaString) {
		this.provinciaString = provinciaString;
	}

	@Override
	public String llamadaEmergencia(TipoEmergencia te, String provincia) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
}
