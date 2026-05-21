package modelo;

import java.time.LocalDate;

/**
 * `ReporteVenta` - resumen de ventas para un periodo o unidad.
 */
public class ReporteVenta {

	private int id;
	private LocalDate fechaGeneracion;
	private double totalVentas;
	private double totalCostos;

	public ReporteVenta() {
	}

	public ReporteVenta(int id, LocalDate fechaGeneracion, double totalVentas, double totalCostos) {
		this.id = id;
		this.fechaGeneracion = fechaGeneracion;
		this.totalVentas = totalVentas;
		this.totalCostos = totalCostos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(LocalDate fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public double getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}

	public double getTotalCostos() {
		return totalCostos;
	}

	public void setTotalCostos(double totalCostos) {
		this.totalCostos = totalCostos;
	}
}