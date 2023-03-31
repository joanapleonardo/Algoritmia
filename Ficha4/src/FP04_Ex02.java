//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP04_Ex02 {
    public static void main(String[] args) {


        System.out.println("\n***** Ficha 4 - Exercicio 2 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Variáveis
    int opcao = 0;

        do
        {
            System.out.println("1 - Criar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Eliminar");
            System.out.println("4 - Sair");

            opcao = input.nextInt();

            switch (opcao)
            {
                case 1: System.out.println ("Escolheu 1 - Criar.");
                    break;

                case 2: System.out.println ("Escolheu 2 - Atualizar.");
                    break;

                case 3: System.out.println ("Escolheu 3 - Eliminar.");
                    break;

                case 4:
                    break;

                default: System.out.println ("Opção inválida.");
            }



        }
        while (opcao != 4);
        //System.out.println ("Escolheu 4 - Sair.");
}

}



