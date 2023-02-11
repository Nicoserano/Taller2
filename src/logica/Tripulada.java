package logica;
/**
 *  // Esta clase es una subclase de la clase Naves y implementa la interface tripulacion
 *  @author Ronald serrano
 *  */
public class Tripulada extends Naves implements tripulacion {
    @Override
    public void tipo() {
        // Este método establece el tipo de la nave como "Nave Tripulada"
        this.setCategoria(" Nave Tripulada");
    }

    @Override
    public void despegar() {
        // Este método imprime en consola que la nave tripulada ha despegado
        System.out.println("la Nave Tripulada ha despegado");

        // Este método aumenta la velocidad de la nave en 10 unidades
        this.setVelocidad(this.getVelocidad() + 10);

    }

    @Override
    public void aterrizar() {
        // Este método imprime en consola que la nave tripulada ha aterrizado
        System.out.println("la Nave Tripulada ha aterrizado");

        // Este método disminuye la velocidad de la nave en 10 unidades
        this.setVelocidad(this.getVelocidad() - 10);
    }

    @Override
    public int tripular(int personas) {
        // Este método regresa el número de personas que tripulan la nave
        return personas;
    }
}

