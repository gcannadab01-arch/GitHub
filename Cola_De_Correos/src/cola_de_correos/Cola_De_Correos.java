/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola_de_correos;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
        
        
/**
 *
 * @author alumno
 */
public class Cola_De_Correos {

    // Nota 3: Constantes para valores que no cambian en el programa
    private static final int MIN_NUMERO = 1;
    private static final int MAX_NUMERO = 100;
    private static final String TIPO_ENVIAR = "Enviar";
    private static final String TIPO_RECOGER = "Recoger";

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        ejecutarMenu();
    }
// Nota 2: Implementación de la funcionalidad en un método principal del menú
    public static void ejecutarMenu() {
        boolean salir = false;

        while (!salir) {
            mostrarOpcionesMenu();
            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    enviar();
                    break;
                case 2:
                    recoger();
                    break;
                case 3:
                    generarLoteDeTickets();
                    break;
                case 4:
                    System.out.println("¡Gracias por utilizar el sistema de Cola de Correos. Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 4.");
            }
            System.out.println(); // Línea en blanco para separar iteraciones
        }
    }

    private static void mostrarOpcionesMenu() {
        System.out.println("=== MENÚ COLA DE CORREOS ===");
        System.out.println("1. Enviar");
        System.out.println("2. Recoger");
        System.out.println("3. Generar lote de tickets");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    // Nota 1: Captura de excepciones para que el usuario solo introduzca números
    private static int leerOpcion() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Limpiar el búfer del scanner
            return -1; // Retorna valor inválido para que el switch muestre el mensaje
        }
    }

    // 1. Enviar
    public static void enviar() {
        int numeroAleatorio = random.nextInt(MAX_NUMERO - MIN_NUMERO + 1) + MIN_NUMERO;
        System.out.println("E-" + numeroAleatorio);
    }

    // 2. Recoger
    public static void recoger() {
        int numeroAleatorio = random.nextInt(MAX_NUMERO - MIN_NUMERO + 1) + MIN_NUMERO;
        System.out.println("R-" + numeroAleatorio);
    }

    // 3. Generar lote de tickets
    public static void generarLoteDeTickets() {
        scanner.nextLine(); // Limpiar salto de línea pendiente

        String tipo = "";
        while (true) {
            System.out.print("Introduce el tipo de tickets a generar (\"Enviar\" o \"Recoger\"): ");
            tipo = scanner.nextLine().trim();
            if (tipo.equalsIgnoreCase(TIPO_ENVIAR)) {
                tipo = TIPO_ENVIAR;
                break;
            } else if (tipo.equalsIgnoreCase(TIPO_RECOGER)) {
                tipo = TIPO_RECOGER;
                break;
            } else {
                System.out.println("Tipo inválido. Debe ser \"Enviar\" o \"Recoger\".");
            }
        }

        int cantidad = 0;
        while (true) {
            System.out.print("Introduce la cantidad total de tickets (debe ser múltiplo de 3): ");
            try {
                cantidad = scanner.nextInt();
                if (cantidad > 0 && cantidad % 3 == 0) {
                    break;
                } else {
                    System.out.println("Error: La cantidad debe ser un número mayor que 0 y múltiplo de 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                scanner.next(); // Limpiar búfer
            }
        }

        mostrarLoteTickets(tipo, cantidad);
    }

    private static void mostrarLoteTickets(String tipo, int cantidad) {
        String prefijo = tipo.equals(TIPO_ENVIAR) ? "E-" : "R-";
        System.out.println("\n--- Lote de Tickets (" + tipo + ") ---");
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt(MAX_NUMERO - MIN_NUMERO + 1) + MIN_NUMERO;
            System.out.println(prefijo + numeroAleatorio);
        }
    }
}

   
