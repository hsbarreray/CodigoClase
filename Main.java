import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] nombres = {"Maria", "Carlos", "Luisa", "Juan", "Sofia"};
        String[] ids = {"12345", "67890", "11111", "22222", "33333"};

        String[] nombresComida = {"Pizza", "Hamburguesa", "Pasta", "Tacos", "Ensalada"};
        String[] tipos = {"Rapida", "Italiana", "Mexicana", "Saludable"};
        float[] preciosComida = {20000, 15000, 18000, 12000, 10000};

        String[] nombresBebida = {"Coca-Cola", "Jugo de naranja", "Agua", "Limonada", "Te frio"};
        String[] tamaños = {"Pequena", "Mediana", "Grande"};
        float[] preciosBebida = {5000, 6000, 3000, 4000, 4500};

        int ic = rand.nextInt(nombres.length);
        cliente cliente1 = new cliente(nombres[ic], ids[ic]);

        int iCom = rand.nextInt(nombresComida.length);
        comida comida1 = new comida(nombresComida[iCom], preciosComida[iCom], tipos[rand.nextInt(tipos.length)]);

        int iB = rand.nextInt(nombresBebida.length);
        bebida bebida1 = new bebida(nombresBebida[iB], preciosBebida[iB], tamaños[rand.nextInt(tamaños.length)]);

        int cantidad1 = rand.nextInt(4) + 1;
        int cantidad2 = rand.nextInt(4) + 1;

        pedido pedido1 = new pedido(cliente1, comida1, cantidad1);
        pedido pedido2 = new pedido(cliente1, bebida1, cantidad2);

        System.out.println("===== PEDIDO DEL RESTAURANTE =====");
        System.out.println("Cliente: " + cliente1.getNombre() + " | ID: " + cliente1.getIdentificacion());
        System.out.println("----------------------------------");
        System.out.println("Comida: " + pedido1.getProducto().getNombre());
        System.out.println("Cantidad: " + pedido1.getCantidad());
        System.out.println("Subtotal comida: $" + pedido1.getTotal());
        System.out.println("----------------------------------");
        System.out.println("Bebida: " + pedido2.getProducto().getNombre());
        System.out.println("Cantidad: " + pedido2.getCantidad());
        System.out.println("Subtotal bebida: $" + pedido2.getTotal());
        System.out.println("----------------------------------");
        System.out.println("TOTAL: $" + (pedido1.getTotal() + pedido2.getTotal()));
        System.out.println("==================================");
    }
}
