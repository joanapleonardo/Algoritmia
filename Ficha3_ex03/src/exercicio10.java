//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio10 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 10 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int valor, contador;

        while (valor > 0)
        {
            System.out.println("Insira valor: ");
            valor = input.nextInt();
        }

    }
}