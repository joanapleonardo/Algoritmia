//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex14 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 14 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int mat[][] = new int[4][4];
        int soma=0;

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.println("Introduzir valor na matriz: ");
                mat[i][j]=input.nextInt();
            }
        }

        //soma = mat[0][0] + mat[1][1] + mat[2][2] + mat[3][3];
        for (int i=0; i<4; i++){
            soma = soma + mat[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + soma);


    }
}