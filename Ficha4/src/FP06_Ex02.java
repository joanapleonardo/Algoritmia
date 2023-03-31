//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP06_Ex02 {

public static void detpos (int n){
    if (n>0) {
        System.out.println("O número é positivo.");
    }
    else if (n==0){
     System.out.println("0 é um número neutro.");
    }
    else if (n<0){
        System.out.println("O número é negativo.");
    }
}

    public static void main(String[] args) {


        System.out.println("\n***** Ficha 6 - Exercicio 2 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira um valor: ");
        num= input.nextInt();

        detpos(num);

    }
}