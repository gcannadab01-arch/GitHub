/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA3EJERCICIO32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner(System.in);

        int anioActual, mesActual, diaActual;
        int anioNacimiento, mesNacimiento, diaNacimiento;
        int anios, meses, dias;

        System.out.print("Introduzca el año actual: ");
        anioActual = teclado.nextInt();

        System.out.print("Introduzca el mes actual: ");
        mesActual = teclado.nextInt();

        System.out.print("Introduzca el dia actual: ");
        diaActual = teclado.nextInt();

        System.out.print("Ahora, introduzca su año de nacimiento: ");
        anioNacimiento = teclado.nextInt();

        System.out.print("Introduzca su mes de nacimiento: ");
        mesNacimiento = teclado.nextInt();

        System.out.print("Por ultimo introduzca su dia de nacimiento: ");
        diaNacimiento = teclado.nextInt();

        // Calculamos la diferencia inicial
        anios = anioActual - anioNacimiento;
        meses = mesActual - mesNacimiento;
        dias = diaActual - diaNacimiento;

        // Ajustamos los dias si la diferencia es negativa
        if (dias < 0) {
            mesActual--;

            if (mesActual == 0) {
                mesActual = 12;
                anioActual--;
            }

            int diasMesAnterior;

            switch (mesActual) {
                case 2:
                    if ((anioActual % 4 == 0 && anioActual % 100 != 0)
                            || anioActual % 400 == 0) {
                        diasMesAnterior = 29;
                    } else {
                        diasMesAnterior = 28;
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    diasMesAnterior = 30;
                    break;

                default:
                    diasMesAnterior = 31;
                    break;
            }

            dias += diasMesAnterior;
            meses--;
        }

        // Ajustamos los meses si la diferencia es negativa
        if (meses < 0) {
            meses += 12;
            anios--;
        }

        System.out.println("Su edad exacta es de " + anios
                + " años, " + meses + " meses y " + dias + " dias.");

        teclado.close();
    }
}

    
    

