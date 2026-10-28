/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicio12;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA4_EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner teclado = new Scanner(System.in);
    static String contrasenaCorrecta = "1234";

    public static String pedirContrasena() {
        System.out.print("Introduzca la contraseña: ");
        String contrasena = teclado.nextLine();

        return contrasena;
    }

    public static boolean comprobarContrasena(String contrasena) {
        return contrasena.equals(contrasenaCorrecta);
    }

    public static void mostrarResultado() {
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            String contrasena = pedirContrasena();

            correcta = comprobarContrasena(contrasena);
            intentos++;

            if (correcta) {
                System.out.println("¡Enhorabuena! Contraseña correcta.");
            } else if (intentos < 3) {
                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
            }
        }

        if (!correcta) {
            System.out.println("ERROR: Acceso denegado.");
        }
    }

    public static void main(String[] args) {
        mostrarResultado();
    }
}

    

