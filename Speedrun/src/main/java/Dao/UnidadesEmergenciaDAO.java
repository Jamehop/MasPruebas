package Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Model.TipoEmergencia;
import Model.UnidadesEmergencia;

public class UnidadesEmergenciaDAO implements DAO<UnidadesEmergencia>{

	private List<UnidadesEmergencia> unidadesActivas=new ArrayList<>();
	
	@Override
	public Optional<UnidadesEmergencia> get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return unidadesActivas;
	}

	@Override
	public void save(UnidadesEmergencia t) throws Exception {
		// TODO Auto-generated method stub
		unidadesActivas.add(t);
	}

	@Override
	public void update(UnidadesEmergencia t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UnidadesEmergencia t) {
		// TODO Auto-generated method stub
		unidadesActivas.remove(t);
	}

	@Override
	public String enviarEmergencia(TipoEmergencia te, String provincia) {
		String texto;
		texto="### Atención a todas las Unidades ###\n ## Emergencia: " + te.toString() + " en la provincia de " + provincia +"\n";
		System.out.println(texto);
		for(UnidadesEmergencia unidadesEmergencia: unidadesActivas) {
			
		}
		return null;
	}
}
