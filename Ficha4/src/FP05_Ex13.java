//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex13 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 13 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int mat[][] = new int [2][10];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduzir valor na posição: " + i);
            arr1[i] = input.nextDouble();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduzir valor na posição: " + i);
            arr2[i] = input.nextDouble();
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j]=[arr1][arr2];
            }
        }


        }
    }

