//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio8 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 8 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int base=2, n;

        System.out.println ("Introduza um número: ");
        n = input.nextInt ();


        while (base<=n)
        {
            System.out.println (base);
            base = base+2;
        }
    }
}