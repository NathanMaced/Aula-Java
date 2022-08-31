
package javaapplication15;

import java.util.Scanner;


public class JavaApplication15 {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        
        int cont=0;
        
        System.out.println("Quantas vezes receber a frase");
        cont=grava.nextInt();
        
        while(cont>0){
        
            System.out.println("Isso é um teste "+cont);
            cont--;
            
        }
    }
    
}
