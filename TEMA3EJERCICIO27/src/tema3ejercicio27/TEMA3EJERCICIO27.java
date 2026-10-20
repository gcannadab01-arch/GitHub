/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        double num1, num2;
        int opcion;

        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Introduzca el segundo numero: ");
        num2 = teclado.nextDouble();

        do {
            System.out.println("\n--- MENU DE OPERACIONES ---");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Salir del programa");
            System.out.print("Elija una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: "
                            + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Resultado de la resta: "
                            + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Resultado de la multiplicacion: "
                            + (num1 * num2));
                    break;

                case 4:
                    try {
                        if (num2 == 0) {
                            throw new ArithmeticException();
                        }

                        System.out.println("Resultado de la division: "
                                + (num1 / num2));

                    } catch (ArithmeticException e) {
                        System.out.println(
                                "Error: no se puede dividir entre cero.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println(
                            "Opcion incorrecta. Introduzca una opcion del 1 al 5.");
            }

        } while (opcion != 5);

        teclado.close();
    }
}

    

