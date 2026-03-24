public class producto {
    private String nombre;
    private float precio;

    public producto(String nombre, float precio) { 
        this.nombre= nombre;
        this.precio= precio;

    }

    public String getnombre(){
        return nombre;
    }

    public float getprecio(){
        return precio;
    }
    public void setprecio(float precio) {
        this.precio= precio;
    }
}
