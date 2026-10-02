/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio3;
 import java.util.Scanner;

public class TEMA3EJERCICIO3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Por último, introduzca un tercer numero: ");
        int num3 = teclado.nextInt();

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor de los introducidos es el " + mayor);
    }
}
    
    

