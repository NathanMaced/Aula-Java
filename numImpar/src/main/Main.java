
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
        
        if(rest != 0){
        System.out.println(num); 
        num++;
        rest=num % 2;
        }
        
        
                
        }
        
        while (num > 200);
        
        
        
    }
    
}
