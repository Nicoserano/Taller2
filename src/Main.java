import logica.Lanzadera;
import logica.Naves;
import logica.NoTripulada;
import logica.Tripulada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Naves> naves = new ArrayList<Naves>();

        // Se crean tres naves y se añaden a la lista de naves
        Lanzadera lanzadera = new Lanzadera();
        lanzadera.setNombre("Saturno V");
        lanzadera.setCapacidadCarga(3500);
        lanzadera.tipo();
        lanzadera.setVelocidad(0);
        lanzadera.tripular(3);
        naves.add(lanzadera);

        NoTripulada notripulada = new NoTripulada();
        notripulada.setNombre("Pionero X");
        notripulada.setCapacidadCarga(0);
        notripulada.tipo();
        notripulada.setVelocidad(0);
        naves.add(notripulada);

        Tripulada tripulada = new Tripulada();
        tripulada.setNombre("Apolo");
        tripulada.setCapacidadCarga(800);
        tripulada.tipo();
        tripulada.setVelocidad(0);
        tripulada.tripular(2);
        naves.add(tripulada);

        Scanner pregunta = new Scanner(System.in);
        int opcion = 0;

        // Bucle que se ejecuta hasta que el usuario eliga la opción 3 (Salir)
        while (opcion != 3){
            System.out.println("1.Inventario");
            System.out.println("2.Crear Nave");
            System.out.println("3.Salir");

            System.out.println("Escoja una opción: ");
            opcion = pregunta.nextInt();
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
                        System.out.println("----------------");
                    }
                    break;
                }
                case 2: {
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

                    if (nueva != null) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Ingrese el nombre de la nave:");
                        String nombre = scan.nextLine();
                        System.out.println("Ingrese la capacidad de carga de la nave:");
                        int capacidadCarga = scan.nextInt();
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
                    System.out.println("Adiós");
                    break;
                }
                default: {
                    System.out.println("Opción inválida, por favor escriba una opción válida");
                    break;
                }

            }
            System.out.println("1.Inventario");
            System.out.println("2.Crear Nave");
            System.out.println("3.Salir");
            System.out.println("Escoja una opcion: ");
            opcion = pregunta.nextInt();
        }
        pregunta.close();
    }











}