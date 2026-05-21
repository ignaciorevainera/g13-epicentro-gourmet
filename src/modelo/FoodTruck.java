package modelo;

/**
 * `FoodTruck` - unidad móvil que extiende `UnidadDeVenta`.
 */
public class FoodTruck extends UnidadDeVenta {

	private String patente;
	private int capacidad;

	public FoodTruck() {
		super();
	}

	public FoodTruck(int id, String nombre, String patente, int capacidad) {
		super(id, nombre);
		this.patente = patente;
		this.capacidad = capacidad;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}