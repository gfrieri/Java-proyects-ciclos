package menuiterativo_gfrieri;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rramos & gfrieri
 */
public class MenuIterativo_gfrieri {

    public static void main(String[] args) {
        long num, num1, dig, x;
        int op, cp;
        double c;
        Scanner leer = new Scanner(System.in);
        Random rr = new Random();
        System.out.println("\nBienvenido a nuestro menú iterativo\n\n¿Qué desea el día de hoy?");
        do {
            System.out.println("\n**************************** Menú **************************");
            System.out.println("* 1. Cantidad de dígitos de un número y cuantos son pares  *");
            System.out.println("* 2. Factorial de un número y si es primo o no             *");
            System.out.println("* 3. Adivina el número en 5 intentos o menos               *");
            System.out.println("* 4. Invierte el signo de los números que quieras          *");
            System.out.println("* 5. Salir                                                 *");
            System.out.println("************************************************************");
            System.out.print("\nDigite una opción: ");
            op = leer.nextInt();
            while (op < 1 || op > 5) {
                System.out.println("\n********************");
                System.out.println("*  Opción inválida *");
                System.out.println("********************");
                System.out.print("\nDigite nuevamente una opción: ");
                op = leer.nextInt();
            } 
            switch (op) {
                case 1:
                    System.out.println("\n-------------------------------------------------------------------");
                    System.out.println("||      CANTIDAD DE DÍGITOS DE UN NÚMERO Y CUANTOS SON PARES     ||");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.print("\nDigite el número entero cuyos dígitos y cuantos de estos son pares desea conocer: ");
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
                    System.out.println("\n|| El número " + num1 + " tiene " + c + " dígitos y "+ cp +" son pares || ");
                    break;
                    
                case 2:
                    System.out.println("\n---------------------------------------------------------");
                    System.out.println("||      FACTORIAL DE UN NÚMERO Y SI ES PRIMO O NO      ||");
                    System.out.println("---------------------------------------------------------");
                    System.out.print("\nDigite el número cuyo factorial y si es primo o no desea conocer: ");
                    num = leer.nextLong();
                    c = 1;
                    dig = 1;
                    cp = 2;
                    x = num;
                    if(num!=1 && num!=0){
                        if(num<0){
                            num = num * -1;
                            }
                        for (int i = 1; i <= num; i++) {
                                c = c * i;
                        }
                        do{
                            num1=num%cp;
                            cp=cp+1;
                            dig=dig+1;
                        }while(num1!=0);
                        
                    if(dig==num){
                        System.out.println("\n|| El factorial de " + x + " es " + c + " y " + x + " es primo ||");
                    }else{
                            System.out.println("\n|| El factorial de " + x + " es " + c + " y "+ x +" no es primo ||");    
                    }
                    }else{
                        if(num==1 || num==0){
                            System.out.println("\n|| El factorial de " + x + " es " + c + " y "+ x +" no es primo ni compuesto ||");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("\n-------------------------------------------------------");
                    System.out.println("||      ADIVINA EL NÚMERO EN 5 INTENTOS O MENOS      ||");
                    System.out.println("-------------------------------------------------------");
                    num = rr.nextInt(100);
                    cp=0;
                    dig=5;
                    do {
                    System.out.print("\nAdivina el número entre 0 y 99\n(intentos restantes: "+dig+"): ");
                    num1 = leer.nextLong();
                        dig=dig-1;
                        if (num1 > num) {
                            System.out.println("\nFallaste, el número es menor");

                        } else {
                            if (num1 < num) {
                                System.out.println("\nFallaste, el número es mayor");

                            }
                        }
                        cp=cp+1;
                    } while (num != num1 && cp<5);
                    if(num1==num){
                        System.out.println("\n|| Correcto, el número es " +num+ ". Adivinaste en " +cp+ " de 5 intentos ||");
                    }else{
                        System.out.println("\n|| No adivinaste en tus 5 intentos, el número era " +num+" ||"+"\n\nMás suerte la próxima...");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("||      INVIERTE EL SIGNO DE LOS NÚMEROS QUE QUIERAS      ||");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("\n¿A cuántos números enteros deseas invertirle su signo?: ");
                    num = leer.nextLong();
                    for(int i = 1; i <= num; i++){
                        System.out.print("\nIngresa el número cuyo signo deseas invertir: ");
                        num1 = leer.nextLong();
                        if(num1==0){
                            System.out.println("|| "+num1+"No tiene signos invertibles ya que no es ni positivo ni negativo ||");
                        }else{
                           num1=num1*-1;
                           System.out.println("|| El número ahora es "+num1+" ||"); 
                        }
                    }
                    System.out.println("\n|| Ya se han invertido todos los números indicados ||");
                    break;
            }
        } while (op < 5);
        System.out.println("\n\nMuchas gracias por utilizar nuestros servicios\n\nLe deseamos lo mejor, vuelva pronto\n");
    }
    
}
