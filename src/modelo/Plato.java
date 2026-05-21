package modelo;

/**
 * Clase `Plato` - representa un elemento de comida vendible en el festival.
 *
 * - Todos los atributos son privados para respetar el encapsulamiento.
 * - Se proveen constructores, getters y setters básicos.
 * - `precio` y `costo` se mantienen separados para permitir calcular
 *   margen o rentabilidad en otras clases sin duplicar lógica aquí.
 */
public class Plato {

	private int id;
	private String nombre;
	private double precio;
	private double costo;

	// Constructor por defecto (útil para frameworks o pruebas simples)
	public Plato() {
	}

	// Constructor completo que inicializa los atributos del dominio
	public Plato(int id, String nombre, double precio, double costo) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.costo = costo;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
}