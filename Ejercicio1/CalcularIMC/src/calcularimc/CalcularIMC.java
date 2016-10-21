/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CalcularIMC {

       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Scanner input = new Scanner(System.in);
        double estatura;
        double masa;
        //ESTATURA
        do{
        System.out.println("Dime tu estatura.");
        estatura = input.nextDouble();
            if(estatura<=0){
                System.out.println("No puede ser menor a 0");
            }
        }while(0>=estatura);
                
        //MASA
        do{
        System.out.println("Dime tu masa.");
        masa = input.nextDouble();
            if(masa<=0){
              System.out.println("No puede ser menor a 0");
            }
        }while(0>=masa);
        double IMC = masa / Math.pow(estatura,2);
        System.out.println("Tu IMC es: " + IMC);
        
        //CALIFICACION
        if( IMC <= 18.50 ){
            System.out.println("Tienes bajo peso.");
        }else if(IMC > 18.50 && IMC < 25){
            System.out.println("Tu peso es normal.");
        }else if(IMC > 25 && IMC < 30){
            System.out.println("Tienes sobrepeso.");
        }else if(IMC > 30 && IMC < 40){
            System.out.println("Tienes obesidad.");
        }else if(IMC >= 40 ){
            System.out.println("Tienes obesidad morbida.");
        }
    }
    
}
