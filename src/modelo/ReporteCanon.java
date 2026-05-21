package modelo;

import java.time.LocalDate;

/**
 * `ReporteCanon` - registro de cánones a cobrar por uso de espacio.
 */
public class ReporteCanon {

	private int id;
	private Festival festival;
	private LocalDate fechaGeneracion;
	private double montoCanon;

	public ReporteCanon() {
	}

	public ReporteCanon(int id, Festival festival, LocalDate fechaGeneracion, double montoCanon) {
		this.id = id;
		this.festival = festival;
		this.fechaGeneracion = fechaGeneracion;
		this.montoCanon = montoCanon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Festival getFestival() {
		return festival;
	}

	public void setFestival(Festival festival) {
		this.festival = festival;
	}

	public LocalDate getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(LocalDate fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public double getMontoCanon() {
		return montoCanon;
	}

	public void setMontoCanon(double montoCanon) {
		this.montoCanon = montoCanon;
	}
}