import java.util.Scanner;

class extra {
    public static void main(String[] args) {
        System.out.println("\n***** Extra *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        int x = 4;
        int mat[][] = new int[3][x];

       /* mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[0][3] = 4;

        mat[1][0] = 5;
        mat[1][1] = 6;
        mat[1][2] = 7;
        mat[1][3] = 8;

        mat[2][0] = 9;
        mat[2][1] = 10;
        mat[2][2] = 11;
        mat[2][3] = 12;*/




               /* int k = 0;
                for(int i=0;i<3;i++)
                {
                    mat[i][0]=++k;
                    mat[i][1]=++k;
                    mat[i][2]=++k;
                    mat[i][3]=++k;
                }*/

               for(int i=0;i<x;i++){
                   mat[0][i]= i + 1;
                   mat[1][i]= (i + x) + 1;
                   mat[2][i]= mat[1][i] + x;
                }


        for (int i=0; i<3; i++) {
            for (int j=0; j<x; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}