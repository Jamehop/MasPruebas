package Model;

public class Trabajador {
	public int id;
	public String nombreString;
	public Trabajador(int id, String nombreString) {
		super();
		this.id = id;
		this.nombreString = nombreString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreString() {
		return nombreString;
	}
	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}
	
}
