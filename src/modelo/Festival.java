package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase `Festival` - representa un festival gastronómico.
 */
public class Festival {

	private int id;
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String ubicacion;
	private List<UnidadDeVenta> unidades;

	public Festival() {
		this.unidades = new ArrayList<>();
	}

	public Festival(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, String ubicacion) {
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.ubicacion = ubicacion;
		this.unidades = new ArrayList<>();
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

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<UnidadDeVenta> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<UnidadDeVenta> unidades) {
		this.unidades = unidades;
	}
}