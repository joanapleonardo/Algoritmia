//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex06 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 06 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double arr[] = new double[10];
        int i=0;
        boolean crescente=true;

        for (int j = 0; j < 10; j++)
        {
            System.out.println("Introduzir valor na posição: 0");
            arr[j] = input.nextDouble();

            if(crescente == true && j > 0 && arr[j - 1] > arr[j])
            {
                crescente = false;
            }
        }

        if (crescente==true)
        {
            System.out.println ("A ordem é crescente!");
        }
        else
        {
            System.out.println ("A ordem não é crescente!");
        }





    }
}