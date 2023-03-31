//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex13 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 13 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int mat[][] = new int [10][2];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduzir valor no vetor1: ");
            arr1[i] = input.nextInt();
          //  mat[0][i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduzir valor no vetor2: ");
            arr2[i] = input.nextInt();
           // mat[1][i] = arr2[i];
        }


            for (int j=0; j<10; j++){
                mat[j][0]=arr1[j];
                mat[j][1]=arr2[j];
            }

        for (int j=0; j<10; j++){
            for (int i=0; i<2; i++){
                System.out.print(" "+ mat[j][i]);
            }
            System.out.println("\n");
        }


        }
    }

