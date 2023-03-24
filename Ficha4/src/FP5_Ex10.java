//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex10 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 10 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declaração de matriz 3x3
        int mat[][] = new int[5][5];
        int soma=0;

        //Introdução dos valores na matriz
        for (int i=0;i<5;i++){
            for (int j=0; j<5;j++){
                System.out.println("Introduza valor: ");
                mat[i][j] = input.nextInt();
                soma=soma+mat[i][j];
            }
        }
        System.out.println("A soma dos valores é: " + soma);


    }
}