package modelo;

/**
 * `Cocinero` - personal con especialidad culinaria.
 */
public class Cocinero extends Personal {

	private String especialidad;

	public Cocinero() {
		super();
	}

	public Cocinero(int id, String nombre, String apellido, String documento, String especialidad) {
		super(id, nombre, apellido, documento);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}