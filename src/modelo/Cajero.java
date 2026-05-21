package modelo;

/**
 * `Cajero` - personal encargado de la caja/ventas.
 */
public class Cajero extends Personal {

	private String turno;

	public Cajero() {
		super();
	}

	public Cajero(int id, String nombre, String apellido, String documento, String turno) {
		super(id, nombre, apellido, documento);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
}