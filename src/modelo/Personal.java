package modelo;

/**
 * Clase abstracta `Personal` - base para roles como Cocinero y Cajero.
 */
public abstract class Personal {

	private int id;
	private String nombre;
	private String apellido;
	private String documento;

	public Personal() {
	}

	public Personal(int id, String nombre, String apellido, String documento) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
}