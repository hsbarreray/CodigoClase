public class producto {
    private String nombre;
    private float precio;

    public producto(String nombre, float precio) { 
        this.nombre= nombre;
        this.precio= precio;

    }

    public String getNombre(){
        return nombre;
    }

    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio= precio;
    }
}
