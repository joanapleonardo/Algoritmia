//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio11 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 11 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //variáveis
        int inicio, fim, maior, menor, ciclo=0;

        //Ler variáveis
        System.out.println ("Inserir inicio: ");
        inicio = input.nextInt ();

        System.out.println ("Inserir final: ");
        fim = input.nextInt ();

        //Definir qual é o número maior e menor para se poder calcular a diferença

        if (fim > inicio)
        {
            maior = fim;
            menor = inicio;
        }

        else

        {
            maior = inicio;
            menor = fim;
        }

        inicio++;

        while (inicio <= fim)
        {
            if (inicio % 5 == 0)
            {
                ciclo++;
                System.out.print ("\n" + inicio + " ");}
            inicio++;
        }



        }
    }