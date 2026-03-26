public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria", "12345");
        comida comida1 = new comida("Pizza", 20000, "Rapida");

        pedido pedido1 = new pedido(cliente1, comida1, 2);

        System.out.println("Cliente: " + pedido1.getCliente().getNombre());
        System.out.println("Producto: " + pedido1.getProducto().getNombre());
        System.out.println("Cantidad: " + pedido1.getCantidad());
        System.out.println("Total: " + pedido1.getTotal());
    }
}