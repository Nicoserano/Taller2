package logica;
/**
 *  Clase Lanzadera que extiende de la clase Naves y implementa la interfaz tripulacion
 * @author Ronald serrano
 * */

public class Lanzadera extends Naves implements tripulacion {

    @Override
    public int tripular(int personas) {     // Sobrescritura del método tripular de la interfaz tripulacion

        return personas;        // Retorna el número de personas pasado como argumento
    }


    @Override
    public void tipo() {
        this.setCategoria(this.getCategoria()+"categoria es: Lanzadera");
    }

    @Override
    public void despegar() {                 // Sobrescritura del método despegar de la clase Naves
        System.out.println("la lanzadera ha despegado"); // Imprime un mensaje en la consola indicando que la nave ha despegado
        this.setVelocidad(this.getVelocidad() + 15);  // Aumenta la velocidad en 15

    }


    @Override
    public void aterrizar() {               // Sobrescritura del método aterrizar de la clase Naves
        System.out.println("la lanzadera ha aterrizado");// Imprime un mensaje en la consola indicando que la nave ha aterrizado
        this.setVelocidad(this.getVelocidad() - 15); // Decrementa la velocidad en 15
    }



}
