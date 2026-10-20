/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio29;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner teclado = new Scanner(System.in);

        int numeroSecreto;
        int numeroUsuario;
        int intentos = 0;

        // Generamos un numero aleatorio entre 1 y 100
        numeroSecreto = (int) (Math.random() * 100) + 1;

        System.out.println("Adivina el numero entre 1 y 100.");

        do {
            System.out.print("Introduce un numero: ");
            numeroUsuario = teclado.nextInt();

            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero que buscas es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero que buscas es menor.");
            } else {
                System.out.println("Enhorabuena, has adivinado el numero.");
                System.out.println("El numero secreto era: " + numeroSecreto);
                System.out.println("Numero de intentos: " + intentos);
            }

        } while (numeroUsuario != numeroSecreto);

        teclado.close();
    }
}

    
    

