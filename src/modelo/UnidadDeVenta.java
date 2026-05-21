package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta `UnidadDeVenta` - base para FoodTruck y PuestoDesarmable.
 */
public abstract class UnidadDeVenta {

	private int id;
	private String nombre;
	private List<Personal> personal;

	public UnidadDeVenta() {
		this.personal = new ArrayList<>();
	}

	public UnidadDeVenta(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.personal = new ArrayList<>();
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

	public List<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Personal> personal) {
		this.personal = personal;
	}
}