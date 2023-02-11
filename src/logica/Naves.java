package logica;

abstract class Naves {
    private String nombre;
    private int capacidadCarga;
    private int velocidad;
    public abstract void despegar();
    public abstract void aterrizar();

    public Naves() {


    }

    public Naves(String nombre, int capacidadCarga, int velocidad) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;

    }
}
