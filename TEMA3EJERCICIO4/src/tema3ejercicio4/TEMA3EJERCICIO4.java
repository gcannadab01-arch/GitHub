/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio4;

import java.util.Scanner;

public class TEMA3EJERCICIO4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Por último, introduzca un tercer numero: ");
        int num3 = teclado.nextInt();

        int menor;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.println("El número menor de los introducidos es el " + menor);
    }
}
    
    

