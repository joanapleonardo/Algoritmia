//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex02 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha Prática 05 - Exercício 01 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double preco[] = new double [10];
        double soma=0;

        for(int i=0; i<10; i++)
        {
            System.out.println("Introduzir o preço de 10 produtos: ");
            preco[i] = input.nextDouble();
        }

        for(int i=0; i<10; i++)
        {
            soma = soma + preco[i];
        }
        System.out.print("Valor total: " + soma);

    }
    }
