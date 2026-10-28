/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicio17;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alumno
 */
public class TEMA4_EJERCICIO17 {

    /**
     * @param args the command line arguments
     */
    
        
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        jugar();
    }

    public static char generarLetra() {
        Random aleatorio = new Random();

        char letra = (char) (aleatorio.nextInt(26) + 97);

        return letra;
    }

    public static char pedirLetra() {
        System.out.print("Introduce una letra minuscula: ");
        char letra = entrada.nextLine().charAt(0);

        return letra;
    }

    public static void jugar() {
        char letraSecreta = generarLetra();
        char letraUsuario;
        int intentos = 0;

        do {
            letraUsuario = pedirLetra();
            intentos++;

            if (letraUsuario < letraSecreta) {
                System.out.println("La letra secreta esta despues en el alfabeto.");
            } else if (letraUsuario > letraSecreta) {
                System.out.println("La letra secreta esta antes en el alfabeto.");
            } else {
                System.out.println("¡Correcto! Has adivinado la letra.");
                System.out.println("Numero de intentos: " + intentos);
            }

        } while (letraUsuario != letraSecreta);
    }
}

        
    
   
