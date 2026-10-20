/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio18;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

        Scanner teclado = new Scanner(System.in);

        String contraseña = "1234";
        String introducida;
        int intentos = 0;

        do {
            System.out.print("Introduzca la contraseña: ");
            introducida = teclado.nextLine();

            intentos++;

            if (introducida.equals(contraseña)) {
                System.out.println("¡Enhorabuena! La contraseña es correcta.");
            } else if (intentos < 3) {
                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
            }

        } while (!introducida.equals(contraseña) && intentos < 3);

        if (!introducida.equals(contraseña)) {
            System.out.println("ERROR: Ha superado los 3 intentos. Acceso denegado.");
        }
    }
}
    
    
    

