//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio12 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 12 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int quant=0, ciclo=1, numantigo=0, numnovo=0;
        boolean crescente=true;

        //Determinar número de ciclos que terão de correr
        System.out.println ("Indique quantidade de números que pretende inserir: ");
        quant = input.nextInt();

        System.out.println ("Indique um número: ");
        numantigo = input.nextInt();

        //Enquanto o número de ciclos corridos for diferente do número inserido pelo user, o programa vai correr
        while (ciclo < quant)
        {
            System.out.println ("Indique um número: ");
            numnovo = input.nextInt();
            //Incrementar número de ciclos sempre que corre até chegar ao número determinado pelo user
            ciclo++;

            //Criar gatilho para controlar quando um numero inserido não é superior ao anterior
            if (numnovo<=numantigo)
            {
                System.out.println ("Atenção! Deixou de ser crescente. ");
                crescente=false;
            }
            numantigo=numnovo;
        }

        if (crescente==true)
        {
            System.out.println ("A ordem é crescente!");
        }
        else
        {
            System.out.println ("A ordem não é crescente!");
        }


    }
}

