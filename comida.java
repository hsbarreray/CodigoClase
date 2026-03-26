public class comida extends producto{
    private String tipo;
public comida(String nombre, float precio, String tipo) {
    super(nombre, precio);
    this.tipo = tipo;
}
public String getTipo(){
    return tipo;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}
}