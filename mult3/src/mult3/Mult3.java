package mult3;

//import java.util.Scanner;


public class Mult3 {

    
    public static void main(String[] args) {
        //Scanner grava = new Scanner (System.in);
        int num = 0, rest;
        
        do{
        num=num+1;
        rest=num%3;
        System.out.println(rest);
        
        switch (rest){
            
            case 1: if(rest==0){ 
            System.out.println(num); 
            num=num+1;
            }
            break;
        
            default:
                System.out.println("Finalizado");
            break;
        }
        
        }
        
        while (num < 100);
    }
    
}
