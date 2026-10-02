/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Cantidad total de dinero
        int dinero = 130;
        
        // Calculamos los billetes de 50 euros
        int billetes50 = dinero / 50;
        
        // Calculamos el dinero que sobra
        int resto = dinero % 50;
        
        // Calculamos los billetes de 10 euros
        int billetes10 = resto / 10;
        
        // Mostramos el resultado
        System.out.println(dinero + " euros hacen un total de: " + billetes50 + " billetes de 50 euros y " + billetes10 + " billetes de 10 euros.");
      {
            
        }
    }
    
}
