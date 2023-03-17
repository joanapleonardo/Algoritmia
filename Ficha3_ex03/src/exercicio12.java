//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio12 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 12 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int n=0, valor=0, ciclo=0, comparar=0, gat=0;

        //Determinar número de ciclos que terão de correr
        System.out.println ("Indique quantidade de números que pretende inserir: ");
        n = input.nextInt();

        //Enquanto o número de ciclos corridos for diferente do número inserido pelo user, o programa vai correr
        while (ciclo != n)
        {
            //Necessário ter uma variável de comparação com o valor anterior inserido
            comparar = valor;

            System.out.println ("Indique um valor: ");
            valor = input.nextInt();
            //Incrementar número de ciclos sempre que corre até chegar ao número determinado pelo user
            ciclo++;

            //Criar gatilho para controlar quando um numero inserido não é superior ao anterior
            if (valor < comparar)
            {
                gat++;
            }
        }

        if (gat == 0)
        {
            System.out.println ("A ordem é crescente!");
        }
        else
        {
            System.out.println ("A ordem não é crescente!");
        }


    }
}

