
package main;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        Scanner grava = new Scanner (System.in);
        int num = 100;
        int rest;
        
        
        do{
        num++;
        rest=num%2;
        
        switch (rest){
            
            case 1: if (rest!=0){
            System.out.println(num); 
            num++;
            rest=num%2;
            }
            break;
        
            default:
                System.out.println("Finalizado");
            break;
        }
        
        }
        
        while (num < 200);
                
        }
        
        
        
        
        
    }
    

