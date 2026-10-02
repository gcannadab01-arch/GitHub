/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercico1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA3EJERCICO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        // Pedimos el número al usuario
        System.out.print("Por favor, introduzca un número: ");
        int numero = teclado.nextInt();
        
        // Comprobamos si es positivo o negativo
        if (numero >= 0) {
            System.out.println("El número elegido es positivo.");
            
        } else {
            System.out.println("El número es negativo.");
            
        }
        
        
    }
    
}
