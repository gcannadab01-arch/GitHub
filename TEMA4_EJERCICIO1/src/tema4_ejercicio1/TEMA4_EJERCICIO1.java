/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA4_EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int numero = teclado.nextInt();

        comprobarNumero(numero);

        teclado.close();
    }

    public static void comprobarNumero(int numero) {
        if (numero > 0) {
            System.out.println("El número introducido es positivo");
        } else if (numero < 0) {
            System.out.println("El número introducido es negativo");
        } else {
            System.out.println("El número introducido es cero");
        }
    }
}

    
    

