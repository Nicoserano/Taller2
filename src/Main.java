import logica.Lanzadera;
import logica.Naves;
import logica.NoTripulada;
import logica.Tripulada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crea una lista para almacenar objetos de la clase Naves
        List<Naves> naves = new ArrayList<Naves>();

        // Se crean tres naves y se añaden a la lista de naves
        // Crea un objeto de la clase Lanzadera y lo añade a la lista de naves
        Lanzadera lanzadera = new Lanzadera();
        lanzadera.setNombre("Saturno V");
        lanzadera.setCapacidadCarga(3500);
        lanzadera.tipo();
        lanzadera.setVelocidad(0);

        naves.add(lanzadera);

        // Crea un objeto de la clase NoTripulada y lo añade a la lista de naves
        NoTripulada notripulada = new NoTripulada();
        notripulada.setNombre("Pionero X");
        notripulada.setCapacidadCarga(0);
        notripulada.tipo();
        notripulada.setVelocidad(0);
        naves.add(notripulada);

        // Crea un objeto de la clase Tripulada y lo añade a la lista de naves
        Tripulada tripulada = new Tripulada();
        tripulada.setNombre("Apolo");
        tripulada.setCapacidadCarga(800);
        tripulada.tipo();
        tripulada.setVelocidad(0);

        naves.add(tripulada);

        // Crea un objeto de la clase Scanner para recibir entrada del usuario
        Scanner pregunta = new Scanner(System.in);
        int opcion = 0;
        System.out.println("1.Inventario");
        System.out.println("2.Crear Nave");
        System.out.println("3.Salir");
        System.out.println("Escoja una opción: ");
        opcion = pregunta.nextInt();
        // Bucle que se ejecuta hasta que el usuario eliga la opción 3 (Salir)
        while (opcion != 3){


            switch (opcion){
                case 1:{
                    // Imprime la información de cada nave en el inventario
                    for (Naves nave : naves) {
                        System.out.println("Nombre: " + nave.getNombre());
                        System.out.println("Categoría: " + nave.getCategoria());
                        System.out.println("Capacidad de Carga: " + nave.getCapacidadCarga());
                        System.out.println("Velocidad: " + nave.getVelocidad()+"Km/h");
                        nave.despegar();
                        System.out.println("Velocidad: " + nave.getVelocidad()+"Km/h");
                        nave.aterrizar();
                        System.out.println("Velocidad: " + nave.getVelocidad() +"Km/h");
                        System.out.println("-----------------------------------------");
                    }
                    break;
                }
                case 2: {
                    // Muestra las opciones para crear una nave
                    System.out.println("1.Lanzadera");
                    System.out.println("2.No Tripulada");
                    System.out.println("3.Tripulada");
                    Scanner pregunta2 = new Scanner(System.in);
                    System.out.println("Escoja una opcion: ");
                    int opcion2 = pregunta2.nextInt();
                    Naves nueva = null;

                    // Crea una nueva nave dependiendo de la opción del usuario
                    if (opcion2 == 1) {
                        nueva = new Lanzadera();
                    }
                    else if (opcion2 == 2) {
                        nueva = new NoTripulada();
                    }
                    else if (opcion2 == 3) {
                        nueva = new Tripulada();

                    }
                    // Si la nueva nave no es nula, le pide al usuario que ingrese su nombre y capacidad de carga
                    if (nueva != null) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Ingrese el nombre de la nave:");
                        String nombre = scan.nextLine();
                        System.out.println("Ingrese la capacidad de carga de la nave:");
                        int capacidadCarga = scan.nextInt();
                        // Establece el nombre y capacidad de carga de la nave y la añade a la lista de naves
                        nueva.setNombre(nombre);
                        nueva.setCapacidadCarga(capacidadCarga);
                        nueva.tipo();
                        nueva.setVelocidad(0);
                        naves.add(nueva);
                        System.out.println("Nave agregada con éxito");
                    }

                    break;
                }
                case 3: {
                    // Muestra un mensaje de despedida
                    System.out.println("Adiós");
                    break;
                }
                default: {
                    // Muestra un mensaje de opción inválida si el usuario ingresa una opción que no está disponible
                    System.out.println("Opción inválida, por favor escriba una opción válida");
                    break;
                }

            }
            // Muestra las opciones disponibles
            System.out.println("1.Inventario");
            System.out.println("2.Crear Nave");
            System.out.println("3.Salir");
            System.out.println("Escoja una opcion: ");
            opcion = pregunta.nextInt();
        }
        // Cierra el scanner
        pregunta.close();
    }
}
