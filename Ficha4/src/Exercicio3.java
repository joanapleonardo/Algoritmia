//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio3 {
    public static void main(String[] args) {


        System.out.println("\n***** Ficha 4 - Exercicio 3 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //variáveis
        int valor1, valor2, ciclo=0;

        do
        {
            System.out.println ("Jogador 1: Introduzir valor entre 0 e 100: ");
            valor1= input.nextInt();
        }
        while (valor1<0 || valor1>100);

        do
        {
            System.out.println ("Jogador 2: Introduzir valor entre 0 e 100: ");
            valor2= input.nextInt();

            if (valor2>valor1)
            {
                System.out.println ("O valor introduzido é superior ao do jogador 1.\n");
            }
            else if (valor2<valor1)
            {
                System.out.println ("O valor introduzido é inferior ao do jogador 1.");
            }
            ciclo++;

        }
        while (valor2 != valor1);

        System.out.println ("Acertou!\nNº de tentativas: " + ciclo);

    }
}
