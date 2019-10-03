/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author gfrieri
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de promedio");

        String nom;
        double sum, prom, cal;
        int c, n;
        Scanner leer = new Scanner(System.in);

        sum = 0;
        c = 1;

        System.out.print("Ingrese su nombre: ");
        nom = leer.nextLine();
        System.out.print("Ingrese el número de calificaciones cuyo promedio desea conocer: ");
        n = leer.nextInt();

        if (n <= 0) {
            System.out.println("");
            System.out.println("El número de calificaciones ingresado es invalido.");
            System.out.println("Porfavor, ingrese un número de calificaciones mayor que 0.");
            System.out.println("");
        } else {
            while (c <= n) {
                System.out.print("Ingrese su calificación: ");
                cal = leer.nextDouble();
                if (cal < 0 || cal > 5) {
                    System.out.println("");
                    System.out.println("La calificación ingresada es invalida.");
                    System.out.println("Porfavor, ingrese calificaciones con valores entre 0 y 5.");
                    System.out.println("");
                } else {
                    sum = sum + cal;
                    c = c + 1;
                }
            }
        }
        
        prom = sum / n;

        if(n>0){
            System.out.println("");
            System.out.println(nom + ", su promedio es: " + prom);
        }

    }

}
