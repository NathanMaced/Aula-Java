
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double max, vel, dif;
        
        System.out.println("Qual a velocidade permitida na via?");
        max= grava.nextDouble();
        System.out.println("Qual a velocidade do seu veiculo?");
        vel= grava.nextDouble();
        
        dif = vel-max;
        
        if(dif <=0){
            System.out.println("Não foi multado");
        } 
        else if (dif <=10){
            System.out.println("Você foi multado em R$80,00");
        }
        else if (dif <=39){
            System.out.println("Você foi multado em R$120,00");
        }
        else{
            System.out.println("Você foi multado em R$200,00");
        
        
    }
    }}
