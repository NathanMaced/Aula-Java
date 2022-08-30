
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
    
        
        Scanner grava = new Scanner(System.in);
        double valor;
     
        System.out.println("Digite o valor: ");
        valor = grava.nextDouble() ;
        
       double porc = valor*0.06;
       
       //System.out.println("6% de " + valor + " é " + porc);
       
       double soma = 10 + porc;
       double div = soma / 4;
       
       System.out.println(div);
       
       
                
       
       
    }}
