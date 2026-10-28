/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicio13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA4_EJERCICIO13 {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    static Scanner teclado = new Scanner(System.in);

    public static int pedirNumero() {
        System.out.print("Introduzca un numero mayor que 1: ");
        int numero = teclado.nextInt();

        return numero;
    }

    public static boolean comprobarNumero(int numero) {
        return numero > 1;
    }

    public static void mostrarResultado() {
        int numero;

        do {
            numero = pedirNumero();

            if (!comprobarNumero(numero)) {
                System.out.println("Error: el numero debe ser mayor que 1.");
            }

        } while (!comprobarNumero(numero));

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        mostrarResultado();
    }
}
