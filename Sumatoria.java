/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

import java.util.Scanner;

/**
 *
 * @author gfrieri
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sumatoria");
        System.out.println("");
        
        int num, sum;
        num = 1;
        sum = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido a sumatoria, donde se suma y suma y suma y suma...");
        System.out.println("...Hasta que ingreses el cero o un número negativo");
        System.out.println("");
        
        while(num>0){
            System.out.print("Ingrese el número que desea sumar: ");
            num = leer.nextInt();
            
            if(num>0){
                sum = sum+num;
                System.out.println("");
                System.out.println("Su suma actual es: "+sum);
                System.out.println("");
                System.out.println("Si desea seguir sumando ingrese otro número");
                System.out.println("Si no desea seguir sumando digite cero o un número negativo");
            }   System.out.println("");
        }
        System.out.println("Su sumatoria final es: "+sum);
    }
    
}
