public class bebida extends producto {
    private String tamaño;

    public bebida (String nombre, float precio, String tamaño){
        super(nombre,precio);
        this.tamaño = tamaño;
    }
    public String gettamaño(){

        return tamaño;
    }
    public void settamaño(String tamaño) {
        this.tamaño = tamaño;
        }
}
