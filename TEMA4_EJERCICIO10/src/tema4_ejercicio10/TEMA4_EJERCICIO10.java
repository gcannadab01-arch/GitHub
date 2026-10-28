/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicio10;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA4_EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = teclado.nextInt();

        return numero;
    }

    public static void mostrarTabla(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        int numero = pedirNumero();
        mostrarTabla(numero);
    }
}

    

