package logica;

public class Lanzadera extends Naves implements tripulacion {
    @Override
    public int tripular(int personas){
        return personas;
    }

    @Override
    public void despegar() {
        this.setVelocidad(this.getVelocidad() + 15);

    }

    @Override
    public void aterrizar() {
        this.setVelocidad(this.getVelocidad() - 13);
    }


}
