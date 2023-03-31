import java.util.Scanner;

class FP06_Ex03 {


    /**
     * Determina se um numero é primo
     * @param n É o numero que vou perceber se e primo ou não
     */

    public static boolean detprimo(int n) {

        int counter = 0;

        for (int a=1; a<=n; a++) {
            if (n % a == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        }else{
            return false;}

    }



    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 06 - Exercício 03 *****\n");

        Scanner input = new Scanner(System.in);

        int num;


        System.out.println("Insira um valor: ");
        num= input.nextInt();

        if (detprimo(num)){
            System.out.println("É primo.");
        }else{
            System.out.println("É não é primo.");
        }

    }

}
