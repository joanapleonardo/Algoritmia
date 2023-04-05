import java.util.Scanner;

public class FP06_Ex09 {

    public static int[] vetor() {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor?");
        int tam = input.nextInt();

        int arr[] = new int[tam];

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Introduzir valor.");
            arr[j] = input.nextInt();
        }

        return arr;
    }

    public static String maiorvetor(int [] vet) {

        int maior = vet[0];

        for (int i = 1; i < vet.length; i++) {

            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        return "Maior valor: " +  maior;
    }

    public static String menorvetor(int [] arr) {

        int menor = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < menor) {
                menor = arr[i];
            }
        }

        return "Menor valor: " + menor;
    }

    public static String vetorcrescente(int [] arr) {

        boolean crescente = true;

        for (int j = 0; j < arr.length; j++) {

            if (crescente == true && j > 0 && arr[j - 1] > arr[j]) {
                crescente = false;
            }
        }

        if(crescente == true)
        {
            return "É crescente";
        }

        return "Não é crescente3";
    }



        public static void opcao(int [] arr){

        Scanner input = new Scanner(System.in);
            int opcao;

        do {

            System.out.println("\nEscolha a opção para determinar:\n 1- o maior valor;\n 2- o menor valor;\n 3- se está crescente;\n 4- Sair.");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println(maiorvetor(arr));
                    break;
                }
                case 2: {
                    System.out.println(menorvetor(arr));
                    break;
                }
                case 3: {
                    System.out.println(vetorcrescente(arr));
                    break;
                }
                case 4:{
                    break;
                }
                default: {
                    System.out.println("A opção é inválida.");
                    break;
                }
            }
        } while (opcao != 4) ;
    }

    public static void main(String[] args) {

        System.out.println("\n***** Ficha Prática 06 - Exercício 08 *****\n");
        Scanner input = new Scanner(System.in);

        int vec[] = vetor();

        opcao(vec);
    }
}
