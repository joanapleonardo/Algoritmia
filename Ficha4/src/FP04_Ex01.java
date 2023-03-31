//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP04_Ex01 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 4 - Exercicio 1 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //variáveis
        int a, b;
        char acao, opcao = 's';

        do
        {
            //ler variáveis
            System.out.print ("Inserir valor A: ");
            a = input.nextInt ();

            System.out.print ("Inserir valor B: ");
            b = input.nextInt ();

            System.out.print ("Inserir cálculo pretendido: ");
            acao = input.next().charAt(0);

            //calcular operações

            if (acao == '+')
            {
                System.out.println ("A soma dos valores é: " + (a + b));
            }

            else if (acao == '-')
            {
                System.out.println ("A subtração dos valores é: " + (a - b));
            }


           else if (acao == '/')
            {
                System.out.println ("A divisão dos valores é: " + (a / b));
            }


            else if (acao == '*')
            {
                System.out.println ("A soma dos valores é: " + (a * b));
            }

            else
            {
                System.out.println ("A ação pretendida é inválida!");
            }


            System.out.print ("Deseja continuar? S/N\n");
            opcao = input.next().charAt(0);
        }
        while ( opcao == 's');

        System.out.print ("Fim de execução");



    }
}
