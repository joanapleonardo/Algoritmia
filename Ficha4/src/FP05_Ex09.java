//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex09 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 10 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declaração de matriz 3x3
        int mat[][] = new int[3][3];

        //Introdução dos valores na matriz
        for (int i=0;i<3;i++){
            for (int j=0; j<3;j++){
                System.out.println("Introduza valor: ");
                mat[i][j] = input.nextInt();
            }
        }
        //Apresentação da matriz
        for (int i=0;i<3;i++){
            for (int j=0; j<3;j++){
                System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }


    }
}