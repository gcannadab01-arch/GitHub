/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variable que contiene el tiempo en segundos
        int tiempo = 10000;
        
        // Calculamos las horas
        int horas = tiempo / 3600;
        
        // Calculamos los minutos restantes
        int minutos = (tiempo % 3600) / 60;
        
        // Calculamos los segundos restantes
        int segundos = tiempo % 60;
        
        // Mostramos el resultado
        System.out.println(tiempo + " segundos hacen un total de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        
        
    }
    
}
