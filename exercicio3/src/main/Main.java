
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       
        Scanner grava = new Scanner(System.in);
        int valor1, valor2;
        
        System.out.println("Digite o valor: ");
        valor1 = grava.nextInt() ;
        
        System.out.println("Digite o valor: ");
        valor2 = grava.nextInt() ;
        
        int calc1 = valor1 + valor2;
        int calc2 = valor1 * valor2;
        int calc3 = valor1 / valor2;
        int calc4 = valor1 - valor2;
        
        System.out.println("Soma = "+ calc1);
        System.out.println("Multiplicação = "+ calc2);
        System.out.println("Divisão = "+ calc3);
        System.out.println("Subtração = "+ calc4);
        
    }
    
}
