/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_2fiesta;

import java.util.Scanner;

/**
 *
 * @author gfrieri
 */
public class Punto_2Fiesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int e, s, ta, th, tm, ph, pm, j, hn, mn, ti, cont;
        ta=0;
        th=0;
        th=0;
        tm=0;
        ph=0;
        pm=0;
        j=0;
        hn=0;
        mn=0;
        ti=0;
        cont=1;
        Scanner leer = new Scanner(System.in);
        
        while(cont==1){
            System.out.println("Edad");
            System.out.print("Escriba la edad de la persona: ");
            e=leer.nextInt();
            System.out.println("");
            
            System.out.println("Sexo");
            System.out.println("1. Hombre");
            System.out.println("2. Mujer");
            System.out.print("Escriba el sexo de la persona: ");
            s=leer.nextInt();
            System.out.println("");
            
            ta=ta+1;
            
            if(s==1){
                th=th+1;
                ph=ph+e;
            }else{
                tm=tm+1;
                pm=pm+e;
            }
            
            if(e>=18){
                ti=ti+1;
                System.out.println("La persona puede ingresar");
                System.out.println("");
                System.out.println("Continuar");
                System.out.println("1. Si");
                System.out.println("0. No");
                System.out.print("¿Desea continuar?: ");
                cont=leer.nextInt();
                System.out.println("");
            }else{
                if(s==1){
                    hn=hn+1;
                    System.out.println("La persona no puede ingresar");
                    System.out.println("");
                }else{
                    mn=mn+1;
                    System.out.println("La persona no puede ingresar");
                    System.out.println("");
                }
                
                if(j==0){
                    j=e;
                }
                
                if(e<j){
                    j=e;
                }
                
                System.out.println("Continuar");
                System.out.println("1. Si");
                System.out.println("0. No");
                System.out.print("¿Desea continuar?: ");
                cont=leer.nextInt();
                System.out.println("");
            }
        }
        ph=ph/th;
        pm=pm/tm;
        
        System.out.println("Resultados");
        System.out.println("");
        System.out.println("Total de personas admitidas: "+ta);
        System.out.println("Total de hombres que asistieron: "+th);
        System.out.println("Total de mujeres que asistieron: "+tm);
        System.out.println("Promedio de edad de hombres: "+ph);
        System.out.println("Promedio de edad de mujeres: "+pm);
        System.out.println("Total de hombres que no ingresaron: "+hn);
        System.out.println("Total de mujeres que no ingresaron: "+mn);
        System.out.println("Edad de la persona más joven: "+j);
    }
    
}
