/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio2;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = teclado.nextInt();

        int resultado;

        if (num1 > 10) {
            resultado = num1 * num2;
            System.out.println("La operación que se realizó es producto y el resultado es " + resultado + ".");
        } else {
            resultado = num1 + num2;
            System.out.println("La operación que se realizó es suma y el resultado es " + resultado + ".");
             }
    }
}
