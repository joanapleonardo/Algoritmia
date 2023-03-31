import java.util.Scanner;

class FP06_Ex05 {

    public static boolean detpar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean detpos (int n){
        if (n > 0)
            return true;
        else
            return false;
    }

    public static boolean detprimo(int n) {

        int counter = 0;

        for (int a=1; a<=n; a++) {
            if (n % a == 0) {
                counter++;
            }
        }

        if (counter == 2)
            return true;
        else
            return false;
    }

    public static boolean detperf(int n){

        int soma=0;

        for(int i=1; i<n; i++) {

            if (n % i == 0)
                soma = soma + i;
        }

        if (soma == n)
            return true;
        else
            return false;
    }

    public static void opcao(){
        Scanner input = new Scanner(System.in);

        //Variáveis
        int num = 0,opcao= 0;


        System.out.println("Insira valor: ");
        num = input.nextInt();

        do {

            System.out.println("Escolha a opção para determinar se o número é: 1 - par; 2 - positivo; 3 - primo; 4 - perfeito; 5 - sair.");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: {
                    if (detpar(num))
                        System.out.println("Par");
                    else
                        System.out.println("Impar");
                    break;
                }

                case 2: {
                    if (detpos(num))
                        System.out.println("Positivo");
                    else
                        System.out.println("Negativo");
                    break;
                }

                case 3: {
                    if (detprimo(num))
                        System.out.println("É primo");
                    else
                        System.out.println("Não é primo");
                    break;
                }

                case 4: {
                    if (detperf(num))
                        System.out.println("É perfeito");
                    else
                        System.out.println("Não é perfeito");
                    break;
                }

                case 5: {
                    break;
                }

                default:
                    System.out.println("Inválida, escolheu: " + opcao);
            }
        }
        while (opcao!=5);
    }



    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 06 - Exercício 05 *****\n");

        opcao();

    }
}