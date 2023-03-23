//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex07 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 07 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int arr[] = new int [10];
        int maior=0, i, a=0;

        for(i=0; i<10; i++)
        {
            System.out.println("Introduzir valor na posição: " + (i + 1));
            arr[i] = input.nextInt();


            if (arr[i]>maior && (arr[i]%2)==0)
            {
                maior = arr[i];
                a=i;
            }
        }

        if (maior==0){
            System.out.println("Não há números pares.");
        }
        else {
            System.out.println("O maior valor é: " + maior + " na posição " + (a+1));
        }
    }
}