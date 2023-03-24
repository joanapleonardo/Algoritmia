//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex05 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 05 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double arr[] = new double[10], soma=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzir valor na posição: " + i);
            arr[i] = input.nextDouble();

            soma = soma + arr[i];

        }

        System.out.println("A média dos valores é: " + soma/10);
    }
}



