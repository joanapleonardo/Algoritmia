import java.util.Scanner;
public class FP06_Ex08 {

    public static boolean vetorcrescente ()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor?");
        int tam = input.nextInt();

        int arr[] = new int[tam];
        int i=0;
        boolean crescente=true;

            for (int j=0; j< arr.length; j++)
        {
            System.out.println("Introduzir valor.");
            arr[j] = input.nextInt();

            if(crescente == true && j > 0 && arr[j - 1] > arr[j])
            {
                crescente = false;
            }
        }

        return crescente;
    }

    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 06 - Exercício 08 *****\n");
        Scanner input = new Scanner(System.in);

        boolean c = vetorcrescente();

        if (c == true) {
            System.out.println ("A ordem é crescente!");
        }
        else {
            System.out.println ("A ordem não é crescente!");
        }
    }
}