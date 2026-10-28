/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicio19;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA4_EJERCICIO19 {

    /**
     * @param args the command line arguments
     */
      
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String dia = pedirDia();
        mostrarPosicion(dia);
    }

    public static String pedirDia() {
        System.out.print("Por favor, introduzca un dia de la semana: ");
        String dia = entrada.nextLine();

        return dia;
    }

    public static void mostrarPosicion(String dia) {

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("El Lunes es el primer dia de la semana.");
                break;

            case "martes":
                System.out.println("El Martes es el segundo dia de la semana.");
                break;

            case "miércoles":
            case "miercoles":
                System.out.println("El Miercoles es el tercer dia de la semana.");
                break;

            case "jueves":
                System.out.println("El Jueves es el cuarto dia de la semana.");
                break;

            case "viernes":
                System.out.println("El Viernes es el quinto dia de la semana.");
                break;

            case "sábado":
            case "sabado":
                System.out.println("El Sabado es el sexto dia de la semana.");
                break;

            case "domingo":
                System.out.println("El Domingo es el septimo dia de la semana.");
                break;

            default:
                System.out.println("El dia introducido no es correcto.");
                break;
        }
    }
}

        
    
    

