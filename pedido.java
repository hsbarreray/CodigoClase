public class pedido {
    private cliente cliente;
    private producto producto;
    private int cantidad;
    private float total;

    public pedido(cliente cliente, producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = calcularTotal();
    }

    public float calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    public cliente getCliente() { return cliente; }
    public void setCliente(cliente cliente) { this.cliente = cliente; }
    public producto getProducto() { return producto; }
    public void setProducto(producto producto) { this.producto = producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public float getTotal() { return total; }
}