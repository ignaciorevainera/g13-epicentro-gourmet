package modelo;

/**
 * Clase intermedia `ItemPlatoPedido` - representa un renglón del pedido
 * que vincula un `Plato` con una `cantidad` pedida.
 *
 * - Esta clase mantiene la responsabilidad de calcular subtotales
 *   relacionados con la cantidad y los valores del `Plato`.
 * - Mantener esta entidad separada facilita agregar futuros
 *   atributos al renglón (por ejemplo: descuentos, observaciones)
 *   sin tocar la entidad `Pedido`.
 */
public class ItemPlatoPedido {

	private Plato plato;
	private int cantidad;

	public ItemPlatoPedido() {
	}

	public ItemPlatoPedido(Plato plato, int cantidad) {
		this.plato = plato;
		this.cantidad = cantidad;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// Retorna el subtotal de venta (precio de venta * cantidad)
	public double subtotalVenta() {
		return cantidad * plato.getPrecio();
	}

	// Retorna el subtotal de costo (costo del plato * cantidad)
	public double subtotalCosto() {
		return cantidad * plato.getCosto();
	}
}