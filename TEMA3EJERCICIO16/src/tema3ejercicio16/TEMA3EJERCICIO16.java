/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio16;

/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidad = 0;
        
        System.out.println("Los números impares existentes entre el número 20 y el 160 son:");
        
        for (int i = 20; i <= 160; i++) { 
            
            if (i % 2 != 0) { System.out.print(i + " - ");
            
            cantidad++;
            
            } 
        } 
        System.out.println();
        
        System.out.println("La cantidad de números impares impresos han sido: " + cantidad);
        
    }
    
}
