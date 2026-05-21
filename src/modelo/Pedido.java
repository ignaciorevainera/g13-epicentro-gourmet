package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase `Pedido` - representa un pedido realizado en una Unidad de Venta
 * dentro de un `Festival` en una fecha determinada.
 *
 * - La lista `items` se inicializa internamente dentro del constructor
 *   con `new ArrayList<>()` para garantizar que cada `Pedido` tenga su
 *   propia colección independiente. Esto evita errores por colecciones
 *   compartidas y facilita la trazabilidad de cada pedido.
 * - La responsabilidad de agregar renglones y calcular totales recae
 *   en esta clase, aprovechando la clase intermedia `ItemPlatoPedido`
 *   para delegar la lógica de subtotal.
 */
public class Pedido {

    private int id;
    private LocalDate fecha;
    private Festival festival;
    private UnidadDeVenta unidad;
    private List<ItemPlatoPedido> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public Pedido(int id, LocalDate fecha, Festival festival, UnidadDeVenta unidad) {
        this.id = id;
        this.fecha = fecha;
        this.festival = festival;
        this.unidad = unidad;
        // Inicialización explícita de la lista de ítems para mantener
        // encapsulamiento y permitir que el pedido sea extendido
        // sin depender de colecciones externas.
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public UnidadDeVenta getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDeVenta unidad) {
        this.unidad = unidad;
    }

    public List<ItemPlatoPedido> getItems() {
        return items;
    }

    public void setItems(List<ItemPlatoPedido> items) {
        this.items = items;
    }

    /**
     * Agrega un plato al pedido creando internamente el ItemPlatoPedido.
     *
     * Ventaja: centraliza la creación de renglones y evita que el llamador
     * tenga que conocer la estructura interna de `ItemPlatoPedido`.
     */
    public void agregarPlato(Plato plato, int cantidad) {
        ItemPlatoPedido item = new ItemPlatoPedido(plato, cantidad);
        items.add(item);
    }

    /**
     * Calcula el monto total del pedido sumando los subtotales de venta
     * de cada renglón. La responsabilidad del cálculo del subtotal por
     * renglón está delegada en `ItemPlatoPedido`.
     */
    public double calcularMontoTotal() {
        double total = 0;

        for (ItemPlatoPedido item : items) {
            total += item.subtotalVenta();
        }

        return total;
    }
}
