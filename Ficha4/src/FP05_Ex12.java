//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex12 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 12 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declaração de matriz 3x3
        int mat[][] = new int[3][3];
        int maior = 0;
        int menor = 0;

        //Introdução dos valores na matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduza valor: ");
                mat[i][j] = input.nextInt();

                if((i ==0 && j == 0) || mat[i][j] < menor) {
                    menor = mat[i][j]; }
                if((i ==0 && j == 0) || mat[i][j] > maior) {
                    maior = mat[i][j]; }
                }
            }

        //Apresentação da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

    }
}