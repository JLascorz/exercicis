/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notamitja;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NotaMitja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int sumaNotas = 0;
        int contador = 0;
        int nota = 0;
        int mitja = 0;
        
        do{
            System.out.println("Introduix la nota " + (contador + 1) + ": ");
            
            nota = input.nextInt();
            
            if(nota >= 0){
                sumaNotas = sumaNotas + nota;
                contador = contador + 1; 
            }
        }while(nota != -1);
        
        mitja = sumaNotas / contador;
        System.out.println("La nota mitja es: " + mitja);
    }
    
}
