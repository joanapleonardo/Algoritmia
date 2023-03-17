//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio7 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 7 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        //Ciclo tem de iniciar a -1 para essa execução não ser contabilizada
        double n=0, ciclo=-1, soma=0, media=0;

        //Ciclo que é executado até o utilizador introduzir o -1
        while (n!=-1)
        {
            //Acrescenta um número ao somatório
            soma = soma + n;
            //Contabiliza a quantidade de numeros introduzidos / ciclos executados
            ciclo++;

            System.out.println ("Introduza valor: ");
            n = input.nextDouble();
        }

        System.out.println("Somatório: " + soma);
        System.out.println("Número de ciclos: " + ciclo);
        media=soma/ciclo;
        System.out.println("A média é: " + media);
    }
}