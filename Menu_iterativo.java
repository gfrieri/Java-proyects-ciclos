/*
Diseñar un menú iterativo con las siguientes opciones:
1.	Cantidad de cifras de un número: Dado un número, informar cuantos dígitos tiene. 
2.	Factorial de un número: Dado un número, calcular su factorial. 
3.	Adivina que número estoy pensando: El programa debe generar aleatoriamente un número entre 0 y 99 
        y el usuario debe adivinarlo siguiendo las pistas del programa. Las pistas que se deben dar es 
        si el número que va dando el usuario es mayor o menor que el generado, así hasta que lo adivine. 
4.	Salir
*/
package menu_iterativo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rramos
 */
public class Menu_iterativo {

    public static void main(String[] args) {
        long num, num1;
        int op, c;
        Scanner leer = new Scanner(System.in);
        Random rr = new Random();
        do {
            System.out.println("\n************** Menú ***************");
            System.out.println("1. Cantidad de dígitos de un número");
            System.out.println("2. Factorial de un número");
            System.out.println("3. Adivina el número");
            System.out.println("4. Salir");
            System.out.println("***********************************");
            System.out.print("\nDigite opción:");
            op = leer.nextInt();
            while (op < 1 || op > 4) {
                System.out.println("********************");
                System.out.println("*  Opción inválida *");
                System.out.println("********************");
                System.out.print("Digite nuevamente opción:");
                op = leer.nextInt();
            } 
            switch (op) {
                case 1:
                    System.out.println("\n***********************************");
                    System.out.println("**      CANTIDAD DE DÍGITOS      **");
                    System.out.print("**Digite número:");
                    num = leer.nextLong();
                    c = 0;
                    num1 = num;
                    while (num != 0) {
                        c = c + 1;
                        num = num / 10;
                    }
                    
                    System.out.println("**El número " + num1 + " tiene " + c + " cifras    **");
                    System.out.println("***********************************");
                    break;
                case 2:
                    System.out.print("Digite el número:");
                    num = leer.nextLong();
                    c = 1;
                    for (int i = 1; i <= num; i++) {
                        c = c * i;
                    }
                    System.out.println("*********************************************");
                    System.out.println("El factorial de " + num + " es " + c);
                    System.out.println("*********************************************");
                    break;
                case 3:
                    num = rr.nextInt(100);
                    do {
                    System.out.println("Adivina el número:");
                    num1 = leer.nextLong();
                        if (num1 > num) {
                            System.out.println("Menor");
                        } else {
                            if (num1 < num) {
                                System.out.println("Mayor");
                            }
                        }
                    } while (num != num1);
                    System.out.println("Adivinasteeeeeeee");
                    break;
            }
        } while (op < 4);
        System.out.println("GRACIAS Y ADIOSSSSSSS!!!!!");
    }
    
}
