//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio10 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 10 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int valor=0, contador1=0, contador2=0, contador3=0, contador4=0, limite=0;

        while (valor >= 0)
        {
            System.out.println("Insira valor: ");
            valor = input.nextInt();

            if (valor >= 0 && valor <= 25)
            {
            contador1++;
            }

            if (valor >= 26 && valor <= 50)
            {
            contador2++;
            }

            if (valor >= 51 && valor <= 75)
            {
            contador3++;
            }

            if (valor >= 76 && valor <= 100)
            {
            contador4++;
            }

            if (valor > 100)
            {
            limite++;
            }
            }

        System.out.println ("Número de entradas entre 0 e 25: " + contador1);
        System.out.println ("Número de entradas entre 26 e 50: " + contador2);
        System.out.println ("Número de entradas entre 51 e 75: " + contador3);
        System.out.println ("Número de entradas entre 76 e 100: " + contador4);
        System.out.println ("Número de entradas superiores a 100: " + limite);


    }
}