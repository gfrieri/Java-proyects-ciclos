/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_3ue;

import java.util.Scanner;

/**
 *
 * @author gfrieri
 */
public class Punto_3UE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Límite de peso de peces pescados");
        System.out.println("");
        
        float lim, peso, tot;
        peso=0;
        tot=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido a su calculadora del límire de peso de peces pescados");
        System.out.println("(O a su calculadora del LPPP para abreviar)");
        System.out.println("");
        
        System.out.print("Porfavor ingrese el LPPP en kilogramos permitido: ");
        lim=leer.nextFloat();
        
        System.out.print("Ingrese el peso del pescado pescado: ");
        peso=leer.nextFloat();
        tot=tot+peso;
        
        while(tot<=lim||peso!=0){
            System.out.println("");
            System.out.println("La cantidad pescada hasta el momento es: "+tot);
            System.out.println("");
        }
        System.out.println("La cantidad pescada ha superado el máximo");
    }
    
}
