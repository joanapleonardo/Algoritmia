//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP06_03 {

    public static void detprimo(int n, counter;){
        for (int a = 2; a<n; a++)
        {
            if (n % a == 0)
                 counter++;
        }

            for (int a = 2; a<n; a++)
            {
                if (n % a == 0)
                     counter++;
            }

            if (counter == 0)
                System.out.println("O número é primo.");

            else
                System.out.println("O número não é primo.");
        }






    }
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 03 *****\n");

        int num, a;
        char opcao;

        do
        {
            int counter=0;
            System.out.println("Inserir valor: ");
            num = input.nextInt();

            for (a = 2; a<num; a++)
            {
                if (num % a == 0)
                    counter++;
            }

            if (counter == 0)
                System.out.println("O número é primo.");

            else
                System.out.println("O número não é primo.");


            System.out.print ("Deseja continuar? S/N\n");
            opcao = input.next().charAt(0);
        }
        while ( opcao == 's' || opcao == 'S');

        System.out.print ("Fim de execução");

    }
}
