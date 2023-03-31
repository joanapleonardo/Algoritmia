//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex11 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 11 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int mat[][]=new int[4][5];
        int ver;
        int counter=0;

        for (int i=0;i<4;i++){
            for (int j=0; j<5; j++){
                System.out.println("Introduzir valor: ");
                mat[i][j]=input.nextInt();
            }
        }
        //Apresentação da matriz
        for (int i=0;i<4;i++){
            for (int j=0; j<5;j++){
                System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Introduza valor de verificação: ");
        ver = input.nextInt();

        for (int i=0;i<4;i++){
            for (int j=0; j<5;j++){
                if(mat[i][j]==ver) {
                    counter++;
                }
                }
            }
        System.out.println("O número "+ver+" repete-se "+counter+" vezes.");







    }
}