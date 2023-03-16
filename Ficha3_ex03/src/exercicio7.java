//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio7 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 7 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double n=0, ciclo=0, soma=0;


        while (n != (-1))
        {
            System.out.println ("Introduza valor: ");
            n = input.nextDouble();
            soma = soma + n;
            ciclo = ciclo + 1;
        }
        System.out.println("A média é: " + (soma / ciclo));
    }
}