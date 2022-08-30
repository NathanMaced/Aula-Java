
package calculoimc;

import java.util.Scanner;


public class CalculoIMC {

    
    public static void main(String[] args) {
        Scanner grava0 = new Scanner(System.in);
        String nome;
        
        Scanner grava1 = new Scanner(System.in);
        double peso, altura;
        
        System.out.println("Digite o nome: ");
        nome = grava0.next() ;
        
        System.out.println("Digite o peso: ");
        peso = grava1.nextDouble() ;
        
        System.out.println("Digite a altura: ");
        altura = grava1.nextDouble() ;
        
        
        double imc = peso/(altura*altura);
        System.out.println("O IMC da(o) "+ nome + " é " + imc);
        
        
        if (imc <18.5) {
            
            System.out.println(" Encontra-se abaixo do peso");
           
        }
        else if (imc <=24.9) {
            System.out.println(" Encontra-se com peso normal");
        }
        
        else if (imc <=29.9) {
            
            System.out.println(" Encontra-se sobrepeso");
        }
        
        else if (imc <=34.9) {
         
          System.out.println(" Encontra-se obesidade leve");
        
        }
        else if (imc <=39.9) {
         
          System.out.println(" Encontra-se obesidade moderada");
        
        }
        else {
         
          System.out.println(" Encontra-se obesidade mórbida");
        
        }
      
    }
    
    
}
