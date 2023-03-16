//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 5 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Ler variáveis

        int n, n1, n2;

        System.out.println ("Inserir valor: ");
        n = input.nextInt();

        n1 = n - 5;
        n2 = n + 5;

        //Imprimir os 5 anteriores e os 5 seguintes.
        while (n1<n)
        {
            System.out.println(n1++ + " ");
        }

        n++;

        while (n<=n2)
        {
            System.out.println(" " + n2++);
        }

    }
}

