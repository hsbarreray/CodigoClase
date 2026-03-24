public class Comida extends Producto {
    private String tipo;

    public Comida(String nombre, float precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
