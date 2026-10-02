/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio6;

import java.util.Scanner;

public class TEMA3EJERCICIO6 {

    
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca la nota del alumno: ");
        int nota = teclado.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("La calificación es: Suspenso.");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("La calificación es: Bien.");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("La calificación es: Notable.");
        } else {
            System.out.println("La calificación es: Sobresaliente.");
        }
    }
}
    
    

