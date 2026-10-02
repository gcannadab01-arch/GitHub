/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02; // Paquete al que pertenece mi clase

/**
 *Clase principal de repaso del Tema 
 * @author alumno
 */
public class Main {
    // Variables (globales)
    static int vida = 100;
    
    // Constantes
    final static float GRAVEDAD = 9.8f;
    
    public static void atacar(){
        int danio = 5; //Variable local
        System.out.println("La vida del heroe es de: " + vida);
        System.out.println("La gravedad es: " + GRAVEDAD);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variables
        // Enteros
        byte edad;
        short distancia = 100;
        int numMatricula = 2543;
        long numAlumnos = 30;
        
        // Decimales
        float altura = 1.70f;
        double peso = 10.5f;
        
        // Booleanos
        boolean esEnReposo = true;
        
        // Caracteres
        char letra = 'A';
        
        System.out.println("¿Es la variable distancia un numero par?");
        int resto = distancia % 2;
       boolean esPar = distancia % 2 == 0;
        System.out.println(resto);
        System.out.println(esPar);
        
        
        
        
    }
    
}
