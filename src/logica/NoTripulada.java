package logica;
/**
 Esta clase es una subclase de la clase Naves y representa una nave no tripulada
 @author Ronald serrano
*/
public class NoTripulada extends Naves{

    @Override
    public void tipo() {
        // Este método establece el tipo de la nave como "Nave No Tripulada"
        this.setCategoria( "Nave No Tripulada");
    }

    @Override
    public void despegar() {
        // Este método imprime en consola que la nave no tripulada ha despegado
        System.out.println("la Nave no Tripulada ha despegado");
        // Este método aumenta la velocidad de la nave en 10 unidades
        this.setVelocidad(this.getVelocidad() + 10);

    }

    @Override
    public void aterrizar() {
        // Este método imprime en consola que la nave no tripulada ha aterrizado
        System.out.println("la Nave no Tripulada ha aterrizado");
        // Este método disminuye la velocidad de la nave en 10 unidades
        this.setVelocidad(this.getVelocidad() - 10);

    }
}