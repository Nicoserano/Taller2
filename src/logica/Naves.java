package logica;
/** Clase abstracta Naves
define los atributos y métodos básicos de una nave
 @author Ronald serrano
*/
public abstract class Naves {
    // Atributo que almacena el nombre de la nave
    private String nombre;
    // Atributo que almacena la capacidad de carga de la nave

    private int capacidadCarga;
    // Atributo que almacena la velocidad de la nave
    private int velocidad;

    // Atributo que almacena la categoria de la nave
    private String categoria;

    public abstract void tipo();
    // Método abstracto para despegar la nave
    public abstract void despegar();
    // Método abstracto para aterrizar la nave
    public abstract void aterrizar();

    // Constructor por defecto de la clase
    public Naves() {
    }

    // Constructor con parámetros de la clase
    public Naves(String nombre, int capacidadCarga, int velocidad , String categoria) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.velocidad = velocidad;
        this.categoria = categoria;
    }

    // Método para obtener el nombre de la nave
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre de la nave
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la capacidad de carga de la nave
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    // Método para establecer la capacidad de carga de la nave
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Método para obtener la velocidad de la nave
    public int getVelocidad() {
        return velocidad;
    }

    // Método para establecer la velocidad de la nave
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Método para obtener la categoria de la nave
    public String getCategoria() {
        return categoria;
    }

    // Método para establecer la categoria de la nave
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
