//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio9 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 3 - Exercicio 9 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Ler variáveis
        int n=0, limite, salto;

        //Definir valor limite
        System.out.println ("Inserir limite: ");
        limite = input.nextInt ();

        //Definir valor do "salto"
        System.out.println ("Inserir valor do incremento: ");
        salto = input.nextInt ();

        //enquanto valor do limite for superior a 0, somar o valor do incremento ao 0.
        while (n<=limite)
        {
            System.out.println (n);
            n = n + salto;
        }
    }
}