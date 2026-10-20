/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador = 0;

        // Pedimos un numero mayor que 0
        do {
            System.out.print("Introduzca un numero mayor que 0: ");
            numero = teclado.nextInt();

            if (numero <= 0) {
                System.out.println("Error: el numero debe ser mayor que 0.");
            }

        } while (numero <= 0);

        // Mostramos los multiplos de 3
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");

        for (int i = 3; i <= numero; i += 3) {
            System.out.println(i);
            contador++;
        }

        // Mostramos el total de numeros
        System.out.println("Total de numeros mostrados: " + contador);

        teclado.close();
    }
}

    
