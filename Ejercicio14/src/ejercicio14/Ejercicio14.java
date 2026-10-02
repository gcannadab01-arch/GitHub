/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Definimos las variables con los datos del ejercicio
        double radio = 5.2f;
        // Utilizamos la constante PI que esta integrada en el programa
        final double PI =Math.PI;
        
        // 2. Calculamos el area usando la fórmula ( PI * ( r * r ))
        double area = PI * ( radio * radio);
        
        // 3. Mostramos el resultado en el formato que se nos pide 
        System.out.println("El area de una circunferencia cuyo radio vale " + radio +" sería igual a: " + area +" metros.%n", double radio, double area);
        
    }
    
}
