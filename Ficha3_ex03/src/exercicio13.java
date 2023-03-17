//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio13 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 13 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num, total=0, fat=0;

        //Ler variáveis
        System.out.println ("Inserir valor: ");
        num = input.nextInt();

        while (num>0)
        {
          fat = fat * total;
          total**
          num--;
        }

        System.out.println ("Fatorial: " + fat);
    }
}