
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
    
        
        Scanner grava = new Scanner(System.in);
        double valor1 , valor2, valor3;
       
         
        System.out.println("Digite a primeira nota");
        valor1 = grava.nextDouble() ;
        
        System.out.println("Digite a segunda nota");
        valor2 = grava.nextDouble() ;
        
        System.out.println("Digite a terceira nota");
        valor3 = grava.nextDouble() ;
        
        double soma = (((valor1 + valor2 + valor3)*10)/2);
        
        System.out.println(" o resultado é: "+soma);
        
    }
    
}
