/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador.de.números;

import java.util.Scanner;

/**
 *
 * @author gfrieri
 */
public class GeneradorDeNúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Generador de números");
        System.out.println("");

        int num, n;
        num = 1;
        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido al generador de números");

        while (num==1) {
            System.out.println("");
            System.out.print("Digite el número hasta el que desea contar: ");
            n = leer.nextInt();

            if (n <= 0) {
                System.out.println("El número digitado es invalido");
                System.out.println("Porfavor digite un número natural");
                System.out.println("");
            } else {
                while (num <= n) {
                    System.out.println(num);
                    num = num + 1;
                }
                num=1;
            }
        }

    }

}
