
package tempo;

import java.util.Scanner;


public class Tempo {

    
    public static void main(String[] args) {
         
        Scanner grava = new Scanner(System.in);
        Double valor;
        
        System.out.println("Digite a sua idade: ");
            double idade = grava.nextDouble();
            
            double dias = idade * 365;
            double horas = dias*24;
        
System.out.println("Você viveu" + dias + " dias ");
System.out.println("Você viveu" + horas + " horas ");

    }
    
    
}
