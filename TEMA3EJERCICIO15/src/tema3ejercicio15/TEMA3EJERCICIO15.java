/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
    
    int numero = teclado.nextInt();
    
    for (int i = 0; i <= 10; i++) {
        
       System.out.println(numero + " x " + i + " = " + (numero * i));
       }
        
    }
    
}
