/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidesu5;

import java.util.Scanner;

/**
 *
 * @author Eli
 */
public class PiramidesU5 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        
        while(true){
            System.out.println("Hola, elija la piramide que desea");
            System.out.println("1. Piramide de numeros");
            System.out.println("2: Piramide de letras");
            
            int opc = lectura.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Eligio la piramide de números");
                   
                    System.out.println("Ingrese el número de filas para la piramide");
                     int filas = lectura.nextInt();
        
                       for (int i = 0; i <= filas; i++) {
                            for (int j = 0; j <=i; j++) {
                              System.out.print("*");
                            }
                            System.out.println();
                        }
                break;
                case 2:
                    System.out.println("Ingrese el numero de filas oara la piramide ");
                    int filas2 = lectura.nextInt();
                    char primLetra = 'A';
                    int primNum = 1;
        
                        for (int i = 1; i<= filas2; i++){
                            for (int j=1; j<= i; j++){
                                 if(i % 2 ==0){
                                    if (primLetra > 'Z'){
                                        primLetra = 'A';
                                   }
                                   System.out.print(primLetra);
                                   primLetra++;
                                }else {
                                    if(primNum > 9){
                                       primNum = 1;
                                    }
                                    System.out.print(primNum);
                                    primNum++;
                                    }
                            }
                            
                            System.out.println();
                        }
                break;
                
                default:
                System.out.println("opcion no valida");
            }
        }
    }
    
}
