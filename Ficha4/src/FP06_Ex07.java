import java.util.Scanner;
public class FP06_Ex07 {

    public static int menorvetor (){

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor?");
        int tam = input.nextInt();

        int arr[] = new int[tam];
        int menor,a=0;

        System.out.println("Introduzir valor na posição: 1");
        arr[0] = input.nextInt();

        menor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            System.out.println("Introduzir valor na posição: " + (i+1));
            arr[i] = input.nextInt();


            if (arr[i] < menor) {
                menor = arr[i];
                a=i;
            }
        }

        return menor;
}
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 06 - Exercício 07 *****\n");
        Scanner input = new Scanner(System.in);

        System.out.println("O menor valor é: "+ menorvetor());

    }
}