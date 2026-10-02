/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio09;

public class Ejercicio09 {

    public static void main(String[] args) {
        // 1. Definimos las variables con los datos del ejercicio
        double radio = 3.55;
        
        // Usamos la constante PI que ya viene integrada en la librería 
        final double PI = Math.PI; 
        
        // 2. Calculamos la longitud usando la fórmula (2 * PI * radio)
        double longitud = 2 * PI * radio;
        
        // 3. Mostramos el resultado con el formato exacto pedido (limitado a 2 decimales)
        System.out.printf("La longitud de una circunferencia cuyo radio vale %.2f sería igual a: %.2f metros.%n", radio, longitud);
    }
    
}
