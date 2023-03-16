//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 5 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Ler variáveis

        int numero, antes, depois;

        System.out.println ("Inserir valor: ");
        numero = input.nextInt();

        antes = numero - 5;
        depois = numero + 5;

        //Imprimir os 5 anteriores e os 5 seguintes.
        while (antes < numero)
        {
            System.out.print(antes++ + " ");
        }

        numero++;

        while (numero <= depois)
        {
            System.out.print(" " + numero++);
        }

    }
}

