import java.util.Scanner;

public class FP06_Ex06 {

    public static int maiorvetor (){

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor?");
        int tam = input.nextInt();

        int vet[] = new int[tam];
        int maior = vet[0];
        int i=0, a=0;

        System.out.println("Introduzir valor na posição 1");
        vet[0] = input.nextInt();

        for(i=1; i< vet.length; i++)
        {
            System.out.println("Introduzir valor na posição: " + (i + 1));
            vet[i] = input.nextInt();


            if (vet[i]>maior)
            {
                maior = vet[i];
                a=i;
            }
        }

        return maior;
    }


    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 06 - Exercício 06 *****\n");
        Scanner input = new Scanner(System.in);

        System.out.println("O maior valor é: "+maiorvetor());


    }
}

