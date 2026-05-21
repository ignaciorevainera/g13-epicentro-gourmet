package modelo;

/**
 * `PuestoDesarmable` - unidad fija/desarmable en el festival.
 */
public class PuestoDesarmable extends UnidadDeVenta {

	private double area; // en metros cuadrados
	private boolean requiereElectricidad;

	public PuestoDesarmable() {
		super();
	}

	public PuestoDesarmable(int id, String nombre, double area, boolean requiereElectricidad) {
		super(id, nombre);
		this.area = area;
		this.requiereElectricidad = requiereElectricidad;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isRequiereElectricidad() {
		return requiereElectricidad;
	}

	public void setRequiereElectricidad(boolean requiereElectricidad) {
		this.requiereElectricidad = requiereElectricidad;
	}
}