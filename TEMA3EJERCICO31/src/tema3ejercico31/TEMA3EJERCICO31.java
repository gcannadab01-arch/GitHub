/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercico31;

/**
 *
 * @author alumno
 */
public class TEMA3EJERCICO31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
    
        int numero;
        int contadorImpares = 0;
        int contadorTotal = 0;

        int impar1 = 0;
        int impar2 = 0;
        int impar3 = 0;

        // Generamos numeros hasta obtener 3 impares
        while (contadorImpares < 3) {

            numero = (int) (Math.random() * 100) + 1;
            contadorTotal++;

            if (numero % 2 != 0) {
                contadorImpares++;

                if (contadorImpares == 1) {
                    impar1 = numero;
                } else if (contadorImpares == 2) {
                    impar2 = numero;
                } else {
                    impar3 = numero;
                }
            }
        }

        // Mostramos los tres numeros impares
        System.out.println("Los tres numeros impares generados son:");
        System.out.println(impar1);
        System.out.println(impar2);
        System.out.println(impar3);

        // Mostramos el total de numeros generados
        System.out.println("Cantidad total de numeros generados: "
                + contadorTotal);
    }
}

    
    

