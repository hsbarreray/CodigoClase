public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private float total;
 
    public Pedido(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = calcularTotal();
    }
 
    public float calcularTotal() {
        return producto.getPrecio() * cantidad;
    }
 
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public float getTotal() { return total; }
}
 