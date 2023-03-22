//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex04 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha Prática 05 - Exercício 01 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double arr[] = new double[10];
        double menor = arr[0];
        int i = 0;

        System.out.println("Introduzir valor na posição: 0");
        arr[i] = input.nextDouble();

        for (i = 1; i < 10; i++) {
            System.out.println("Introduzir valor na posição: " + i);
            arr[i] = input.nextDouble();


            if (arr[i] < menor) {
                menor = arr[i];
            }
        }
        System.out.println("O maior valor é: " + menor + " na posição " + i);

    }
}
