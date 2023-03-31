//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP06_Ex01 {

    public static boolean detpar(int n) {
        if (n % 2 == 0) {
           return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {


        System.out.println("\n***** Ficha 6 - Exercicio 1 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        if (detpar(num)){
            System.out.println("É par.");
        }else{
            System.out.println("É impar.");
        }
    }
}