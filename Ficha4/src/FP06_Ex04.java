import java.util.Scanner;

class FP06_Ex04 {
    public static void detperf(int n){

        int soma=0;

        for(int i=1; i<n; i++) {

            if (n % i == 0)
                soma = soma + i;
        }

        if (soma == n) {
            System.out.println("O número é perfeito.");

        } else {
            System.out.println("O número não é perfeito.");
        }


}

    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 06 - Exercício 04 *****\n");

        Scanner input = new Scanner(System.in);

        int num;


        System.out.println("Insira um valor: ");
        num= input.nextInt();

        detperf(num);


    }
}