//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex03 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha Prática 05 - Exercício 01 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double arr[] = new double [10];
        double maior=arr[0];
        int i=0;

        for(i=0; i<10; i++)
        {
            System.out.println("Introduzir valor na posição: " + (i + 1));
            arr[i] = input.nextDouble();


            if (arr[i]>maior){
                maior = arr[i];
            }
        }
        System.out.println("O maior valor é: " + maior + " na posição " + i);

    }
}
