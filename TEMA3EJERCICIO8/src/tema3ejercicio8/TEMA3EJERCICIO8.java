/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio8;

 import java.util.Scanner;

public class TEMA3EJERCICIO8 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int dinero = teclado.nextInt();

        System.out.println(dinero + " Euros se descomponen en:");

        int billetes50 = dinero / 50;
        dinero = dinero % 50;

        int billetes20 = dinero / 20;
        dinero = dinero % 20;

        int billetes10 = dinero / 10;
        dinero = dinero % 10;

        int billetes5 = dinero / 5;
        dinero = dinero % 5;

        int monedas2 = dinero / 2;
        dinero = dinero % 2;

        int monedas1 = dinero;

        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }

        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }

        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }

        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }

        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }

        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
    }
}
  
