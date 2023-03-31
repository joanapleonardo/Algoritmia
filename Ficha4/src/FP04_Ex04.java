//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP04_Ex04 {
    public static void main(String[] args) {


        System.out.println("\n***** Ficha 4 - Exercicio 4 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
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