
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double salario, vt, tr, ir1, ir2;
        
        System.out.println("Digite o valor do seu salario");
        salario=grava.nextDouble();
        
        vt = salario * 0.02;
        salario = salario - vt;
        tr = salario * 0.06;
        salario = salario - tr;
        ir1 = salario * 0.07;
        salario = salario - ir1;
        
        if(salario >1200){
            ir2 = salario * 0.15;
            salario = salario - ir2;
            System.out.println("Você foi sobre taxado R$"+ salario);
        }
        else{
            System.out.println("Você não foi sobre taxado ");
        }
        
        System.out.println("Foi descontado do Vale-Transporte R$"+ vt);
        System.out.println("Foi descontado do Ticket-Refeição R$"+ tr);
        System.out.println("Foi descontado do Imposto de Renda R$"+ ir1);
        System.out.println("Seu salario foi de R$"+ salario);
        
        
    
}
}