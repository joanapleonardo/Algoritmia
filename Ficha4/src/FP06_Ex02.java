//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP06_Ex02 {

public static boolean detpos (int n){
    if (n > 0) {
        return true;
    } else {
        return false;
    }
}

    public static void main(String[] args) {


        System.out.println("\n***** Ficha 6 - Exercicio 2 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira um valor: ");
        num= input.nextInt();

        if (detpos(num)){
            System.out.println("É positivo.");
        }else{
            System.out.println("É negativo.");
        }
    }
}