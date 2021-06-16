package Controllers;

import javafx.scene.control.Button;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import Dao.DAO;
import Dao.UnidadesEmergenciaDAO;
import Model.Ambulancia;
import Model.Bomberos;
import Model.Policia;
import Model.TipoEmergencia;
import Model.Trabajador;
import Model.UnidadesEmergencia;
import Model.UnidadesEmergenciaBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class SistemaEmergenciasController implements Initializable {
	public UnidadesEmergenciaDAO unidadesActivas = new UnidadesEmergenciaDAO();
	
	Trabajador uno = new Trabajador(0, "Manolo");
	Trabajador dos = new Trabajador(1, "Pepe");
	Trabajador tres = new Trabajador(2, "Benito");
	Trabajador cuatro = new Trabajador(3, "Laura");
	Trabajador cinco = new Trabajador(4, "Victoria");
	Trabajador seis = new Trabajador(5, "Rosa");
	Trabajador siete = new Trabajador(6, "Miguel");

	// Creo las unidades de emergencias
	Ambulancia a = UnidadesEmergenciaBuilder.crearAmbulancia(1, Arrays.asList(uno, dos, tres), "Zaragoza");
	Ambulancia b = UnidadesEmergenciaBuilder.crearAmbulancia(2, Arrays.asList(uno, dos, tres), "Teruel");
	Ambulancia c = UnidadesEmergenciaBuilder.crearAmbulancia(3, Arrays.asList(uno, dos, tres), "Huesca");
	private List<Ambulancia> todasAmbulancias = new ArrayList<>();

	Bomberos d = UnidadesEmergenciaBuilder.crearBomberos(4, Arrays.asList(uno, dos, tres, cuatro, cinco), "Zaragoza");
	Bomberos e = UnidadesEmergenciaBuilder.crearBomberos(5, Arrays.asList(uno, dos, tres, cuatro, cinco), "Teruel");
	Bomberos f = UnidadesEmergenciaBuilder.crearBomberos(6, Arrays.asList(uno, dos, tres, cuatro, cinco), "Huesca");
	private List<Bomberos> todosBomberos=new ArrayList<>();

	Policia g = UnidadesEmergenciaBuilder.crearPolicia(7, Arrays.asList(seis, siete), "Zaragoza");
	Policia h = UnidadesEmergenciaBuilder.crearPolicia(8, Arrays.asList(tres, siete), "Teruel");
	Policia i = UnidadesEmergenciaBuilder.crearPolicia(9, Arrays.asList(cinco, siete), "Huesca");
	private List<Policia> todosPolicias=new ArrayList<>();
	
	

	@FXML
	private Button btnEmergencia;

	@FXML
	private RadioButton btnTrafico;

	@FXML
	private ToggleGroup Accidentes;

	@FXML
	private RadioButton btnCasero;

	@FXML
	private RadioButton btnInundacion;

	@FXML
	private RadioButton btnZaragoza;

	@FXML
	private ToggleGroup Provincia;

	@FXML
	private RadioButton btnHuesca;

	@FXML
	private RadioButton btnTeruel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		todasAmbulancias.add(a);
		todasAmbulancias.add(b);
		todasAmbulancias.add(c);
		
		todosBomberos.add(d);
		todosBomberos.add(e);
		todosBomberos.add(f);
		
		todosPolicias.add(g);
		todosPolicias.add(h);
		todosPolicias.add(i);
	}

	public void AnunciarEmergencia() {
		if(btnCasero.isSelected()) {
			if(btnZaragoza.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.CASERO, "Zaragoza");
				
			}
			if(btnHuesca.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.CASERO, "Huesca");
			}
			if(btnTeruel.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.CASERO, "Teruel");
			}
		}
		if(btnTrafico.isSelected()) {
			if(btnZaragoza.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.TRAFICO, "Zaragoza");
			}
			if(btnHuesca.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.TRAFICO, "Huesca");
			}
			if(btnTeruel.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.TRAFICO, "Teruel");
			}
		}
		if(btnInundacion.isSelected()) {
			if(btnZaragoza.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.INCENDIO, "Zaragoza");
			}
			if(btnHuesca.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.INCENDIO, "Huesca");
			}
			if(btnTeruel.isSelected()) {
				unidadesActivas.enviarEmergencia(TipoEmergencia.INCENDIO, "Teruel");
			}
		}
		
	}

	
}
