import logica.Lanzadera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Inventario");
        System.out.println("2.Crear Nave");
        System.out.println("3.Salir");
        Scanner pregunta = new Scanner(System.in);
        System.out.println("Escoja una opcion: ");
        int opcion = pregunta.nextInt();
        while (opcion != 3){
            switch (opcion){
                case 1:{
                    break;
                }
                case 2:
                    break;
                default: {
                    System.out.println("Opción inválida, por favor escriba una opción válida");
                }
            }
            System.out.println("Escoja una opcion: ");
            opcion = pregunta.nextInt();
        }
        pregunta.close();
    }











}