/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creamos el Scanner para introducir datos por teclado
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario los segundos
        System.out.print("Por favor, introduzca un número de segundos: "); int segundosTotales = teclado.nextInt();
        
        // Calculamos los días
        int dias = segundosTotales / 86400;
        
        // Calculamos las horas restantes
        int horas = (segundosTotales % 86400) / 3600;
        
        // Calculamos los minutos restantes
        int minutos = (segundosTotales % 3600) / 60;
        
        // Calculamos los segundos restantes
        int segundos = segundosTotales % 60;
        
        // Mostramos el resultado
        System.out.println(segundosTotales + " segundos hacen un total de: " + dias + " días, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        
        
    }
    
}
