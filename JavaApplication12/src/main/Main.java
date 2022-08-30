        package main;

        import java.util.Scanner;


        public class Main {


            public static void main(String[] args) {

        Scanner grava = new Scanner(System.in);
        int op =0;

        do {
        System.out.println ("1 - Cadastrar , 2 - Alterar , 3 - Excluir , 4 - Sair");
        op = grava.nextInt();
        if(op ==1){
        System.out.println ("Cadastrado");
        }
        else if(op ==2){
        System.out.println("Alterado");
        }
        else if(op ==3){
        System.out.println("Excluído");
        }
        else if(op ==4){
        System.out.println("Finalizado");
        }
        else{
        System.out.println("Opção inválida");
        }
        }
        while(op!=4);
        


            }

        }
