/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detector.de.números;

import java.util.Scanner;

/**
 *
 * @author gfrieri
 */
public class DetectorDeNúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Detector de números");
        System.out.println("");
        
        int cn, cp, cneu, x, num, n;
        cn=0; cp=0; cneu=0; x=1;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido a detector de números");
        System.out.println("");
        System.out.print("Digite la cantidad de números cuyo tipo desea conocer: ");
        n = leer.nextInt();
        System.out.println("");
        
        while(x<=n){
            System.out.print("Digite un número entero: ");
            num = leer.nextInt();
            if(num==0){
                cn=cn+1;
            }else{
                if(num>0){
                    cp=cp+1;
                }else{
                    cneu=cneu+1;
                }
            }
            x=x+1;
        }
        
        System.out.println("");
        System.out.println("Usted tiene "+cn+" negativos, "+cp+" positivos y "+cneu+" neutros.");
    }
    
}
