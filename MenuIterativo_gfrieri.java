/*
Diseñar un menú iterativo con las siguientes opciones:
1.	Cantidad de cifras de un número: Dado un número, informar cuantos dígitos tiene. ""Adicionar: cuántos dígitos son pares.""

2.	Factorial de un número: Dado un número, calcular su factorial. ""Adicionar: si el número es primo o no.""

3.	Adivina que número estoy pensando: El programa debe generar aleatoriamente un número entre 0 y 99 
        y el usuario debe adivinarlo siguiendo las pistas del programa. Las pistas que se deben dar es 
        si el número que va dando el usuario es mayor o menor que el generado, así hasta que lo adivine.
        ""Adicionar: Debe mostrar la cantidad de intentos que tuvo para adivinar el número.
        Adicionar que máximo 5 intentos para adivinar, sino adivina debe mostrar el número e informarle que PERDIOOOOOOO.""
      
4.      ""Adicionar: De los ejercicios realizados para practicar para el parcial, escoger uno y traducir como opción 4.""
        
5.	Salir
*/
package menuiterativo_gfrieri;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rramos
 */
public class MenuIterativo_gfrieri {

    public static void main(String[] args) {
        long num, num1, dig;
        int op, cp;
        double c, p, ca, num2;
        Scanner leer = new Scanner(System.in);
        Random rr = new Random();
        do {
            System.out.println("\n***************** Menú *****************");
            System.out.println("* 1. Cantidad de dígitos de un número y sus digitos pares  *");
            System.out.println("* 2. Factorial de un número y si es primo o no *");
            System.out.println("* 3. Adivina el número                 *");
            System.out.println("* 4. pendiente                           *");
            System.out.println("* 5. Salir                             *");
            System.out.println("****************************************");
            System.out.print("\nDigite opción: ");
            op = leer.nextInt();
            while (op < 1 || op > 4) {
                System.out.println("********************");
                System.out.println("*  Opción inválida *");
                System.out.println("********************");
                System.out.print("Digite nuevamente opción: ");
                op = leer.nextInt();
            } 
            switch (op) {
                case 1:
                    System.out.println("\n-----------------------------------");
                    System.out.println("||      CANTIDAD DE DÍGITOS      ||");
                    System.out.println("-----------------------------------");
                    System.out.print("\nDigite número:");
                    num = leer.nextLong();
                    c = 0;
                    cp = 0;
                    num1 = num;
                    while (num != 0) {
                        c = c + 1;
                        dig = num%10;
                        if(dig%2==0){
                            cp = cp+1;
                        }
                        num = num / 10;
                    }
                    
                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("||El número " + num1 + " tiene " + c + " cifras y "+ cp +" dígitos pares||");
                    System.out.println("--------------------------------------------------------------------------");
                    break;
                    
                case 2:
                    System.out.print("Digite el número:");
                    num2 = leer.nextLong();
                    c = 1;
                    p = 2;
                        for (int i = 1; i <= num2; i++) {
                        c = c * i;
                    }
                    if(num2==1 || num2==0){
                        System.out.println("\n*********************************************");
                        System.out.println("El factorial de " + num2 + " es " + c + " y no es primo ni compuesto");
                        System.out.println("*********************************************");  
                    }else{
                        for(int o=2; o<=num2; o++){
                            ca = num2/o;
                        }
                        
                        
                        do{
                        ca = num2/p;
                        p = p+1;
                    }while(p <= num2 && ca!=0);
                        
                        
                        
                        if(o==num2){
                            System.out.println("\n*********************************************");
                            System.out.println("El factorial de " + num2 + " es " + c + " y es primo");
                            System.out.println("*********************************************"); 
                        }else{
                            System.out.println("\n*********************************************");
                            System.out.println("El factorial de " + num2 + " es " + c + " y no es primo");
                            System.out.println("*********************************************"); 
                        }
                    }

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
        } while (op < 5);
        System.out.println("GRACIAS Y ADIOSSSSSSS!!!!!");
    }
    
}
























