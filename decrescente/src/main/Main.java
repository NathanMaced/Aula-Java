
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int valor =1, acumula = 0, cont = 0;
        double media=0;
        while (valor!=0){
        
        System.out.println("Digite a idade ou 0 para sair");
        valor= grava.nextInt();
        acumula = acumula + valor;
        cont++;
        
        cont--;
        media=acumula/cont;
        
        System.out.println("A média de idade dos aluno é "+media);
    }}}
    

