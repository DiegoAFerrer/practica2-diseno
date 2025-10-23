public class Billete {
    private char tipo;
    private String nombre;
    private int precio;

    public Billete(char tipo, String nombre, int precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio(){
        return this.precio;
    }
}