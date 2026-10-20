/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio34;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        


        Scanner teclado = new Scanner(System.in);

        int diaSalida, horaSalida, minutoSalida;
        int diaLlegada, horaLlegada, minutoLlegada;
        int salida, llegada, diferencia;
        int horas, minutos;

        System.out.println("Introduzca los datos de salida del tren:");

        System.out.print("Dia de salida: ");
        diaSalida = teclado.nextInt();

        System.out.print("Hora de salida (0-23): ");
        horaSalida = teclado.nextInt();

        System.out.print("Minuto de salida (0-59): ");
        minutoSalida = teclado.nextInt();

        // Convertimos la salida a minutos
        salida = diaSalida * 1440 + horaSalida * 60 + minutoSalida;

        do {
            System.out.println("\nIntroduzca los datos de llegada del tren:");

            System.out.print("Dia de llegada: ");
            diaLlegada = teclado.nextInt();

            System.out.print("Hora de llegada (0-23): ");
            horaLlegada = teclado.nextInt();

            System.out.print("Minuto de llegada (0-59): ");
            minutoLlegada = teclado.nextInt();

            // Comprobamos que la hora y el minuto sean validos
            if (diaLlegada < 1 || horaLlegada < 0 || horaLlegada > 23
                    || minutoLlegada < 0 || minutoLlegada > 59) {
                System.out.println("Error: los datos introducidos no son validos.");
                llegada = -1;
            } else {
                // Convertimos la llegada a minutos
                llegada = diaLlegada * 1440
                        + horaLlegada * 60 + minutoLlegada;

                if (llegada < salida) {
                    System.out.println(
                            "Error: la llegada no puede ser anterior a la salida.");
                }
            }

        } while (llegada < salida || diaLlegada < 1
                || horaLlegada < 0 || horaLlegada > 23
                || minutoLlegada < 0 || minutoLlegada > 59);

        // Calculamos el tiempo total del viaje
        diferencia = llegada - salida;

        horas = diferencia / 60;
        minutos = diferencia % 60;

        System.out.println("\nEl tren tarda " + horas
                + " horas y " + minutos + " minutos en llegar a su destino.");

        teclado.close();
    }
}

    
    

