/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio28;

/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int numero;

        // Generamos un numero aleatorio entre 1 y 100
        numero = (int) (Math.random() * 100) + 1;

        // Mostramos el numero generado
        System.out.println("El numero aleatorio generado es: " + numero);

        // Comprobamos si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }


    }
    

