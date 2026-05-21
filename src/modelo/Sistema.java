package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase `Sistema` - contenedor raíz del dominio (modelo simplificado).
 */
public class Sistema {

	private String nombre;
	private List<Festival> festivales;

	public Sistema() {
		this.festivales = new ArrayList<>();
	}

	public Sistema(String nombre) {
		this.nombre = nombre;
		this.festivales = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Festival> getFestivales() {
		return festivales;
	}

	public void setFestivales(List<Festival> festivales) {
		this.festivales = festivales;
	}
}