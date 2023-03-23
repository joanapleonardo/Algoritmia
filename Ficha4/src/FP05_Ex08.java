//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex08 {
    public static void main(String[] args) {
        System.out.println("\n***** Ficha Prática 05 - Exercício 08 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int counter = 0;
        char arr[] = new char[2];
        char arr_[] = new char[2];


        for (int i=0; i<arr.length; i++){
            System.out.println("Inserir valor array1: ");
            arr[i] = input.next().charAt(0);
            arr[i] = Character.toUpperCase(arr[i]);
        }

        for (int i=0; i<arr_.length; i++){
            System.out.println("Inserir valor array2: ");
            arr_[i] = input.next().charAt(0);
            arr_[i] = Character.toUpperCase(arr_[i]);
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != arr_[i])
            {
                counter++;
            }
        }


        if(counter == 0)
        {
            System.out.println("As strings são idênticas.");
        }
        else
        {
            System.out.println("As strings são diferentes.");
        }

    }
}
