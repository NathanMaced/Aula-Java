package mult3;

import java.util.Scanner;


public class Mult3 {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        int num = 0,rest;
        
        do{
        num++;
        rest=num%3;
        
        switch (rest){
            
            case 1: if (rest<1){ 
            num++;
            System.out.println(num); 
            
            }
            break;
        
            default:
                System.out.println("Finalizado");
            break;
        }
        
        }
        
        while (num <= 100);
    }
    
}
