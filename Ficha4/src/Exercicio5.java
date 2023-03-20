//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class exercicio5 {
    public static void main(String[] args) {


        System.out.println("\n***** Ficha 4 - Exercicio 5 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        char cargo, opcao = 's';
        int dias = 0, codigo_f = 0;
        double irs = 0, ss_f = 0, ss_ep = 0, valor_lq = 0, valor_sub = 0, valorfinal = 0, bonus = 0;


        do{
        // ler código do funcionário
        System.out.println("Insira código de funcionário:");
        codigo_f = input.nextInt();

                // ler cargo
                System.out.println("Insira o cargo do funcionário (E - Empregado; C - Chefe; A - Administrador):");
                cargo = input.next().charAt(0);


            // ler dias trabalhados
        System.out.println("Insira nº de dias trabalhados:");
        dias = input.nextInt();

        //Calcular
        switch (cargo)
        {
            case 'E':
            case 'e':
            {
                valor_lq = 40 * dias;
                valor_sub = 5 * dias;
                    if (dias > 20) {
                        bonus = valor_lq * 0.05;}

                    else if (dias > 17 && dias <= 20){
                        bonus = valor_lq * 0.02;}

                    else if (dias <= 17){
                        bonus = 0;}
                ss_f = (valor_lq + valor_sub) * 0.11;
                ss_ep = (valor_lq + valor_sub) * 0.2375;
                    if (valor_lq < 1000) {
                        irs = (valor_lq + valor_sub + bonus) * 0.1;}
                    else if (valor_lq >= 1000 && valor_lq < 2500) {
                        irs = (valor_lq + valor_sub + bonus) * 0.2;}
                    else if (valor_lq >= 2500) {
                        irs = (valor_lq + valor_sub + bonus) * 0.3;}
                valorfinal = (valor_lq + valor_sub + bonus) - irs - ss_f;
                break;
            }

            case 'C':
            case 'c':
            {
                valor_lq = 60 * dias;
                valor_sub = 7.5 * dias;
                    if (dias > 20) {
                        bonus = valor_lq * 0.05;}

                    else if (dias > 17 && dias <= 20){
                        bonus = valor_lq * 0.02;}

                    else if (dias <= 17){
                        bonus = 0;}
                ss_f = (valor_lq + valor_sub) * 0.11;
                ss_ep = (valor_lq + valor_sub) * 0.2375;
                    if (valor_lq < 1000) {
                        irs = (valor_lq + valor_sub + bonus) * 0.1;}
                    else if (valor_lq >= 1000 && valor_lq < 2500) {
                        irs = (valor_lq + valor_sub + bonus) * 0.2;}
                    else if (valor_lq >= 2500){
                irs = (valor_lq + valor_sub + bonus) * 0.3;}
                valorfinal = (valor_lq + valor_sub + bonus) - irs - ss_f;
                break;
            }
            case 'A':
            case 'a':
            {
                valor_lq = 80 * dias;
                valor_sub = 7.5 * dias;
                    if (dias > 20) {
                        bonus = valor_lq * 0.05;}

                    else if (dias > 17 && dias <= 20){
                        bonus = valor_lq * 0.02;}

                    else if (dias <= 17){
                        bonus = 0;}
                ss_f = (valor_lq + valor_sub) * 0.09;
                ss_ep = (valor_lq + valor_sub) * 0.21;
                    if (valor_lq < 1000) {
                        irs = (valor_lq + valor_sub + bonus) * 0.1;}
                    else if (valor_lq >= 1000 && valor_lq < 2500) {
                        irs = (valor_lq + valor_sub + bonus) * 0.2;}
                    else if (valor_lq >= 2500) {
                        irs = (valor_lq + valor_sub + bonus) * 0.3;}
                valorfinal = (valor_lq + valor_sub + bonus) - irs - ss_f;
                break;

            }
        }


        System.out.println("\nVencimento base:" + (valor_lq+bonus) + "EUR");
        System.out.println("Sub. alimentação:" + valor_sub + "EUR");
        System.out.println("IRS: -" + irs + "EUR");
        System.out.println("Retenção SS funcionário: -" + ss_f + "EUR");
        System.out.println("Retenção SS entidade patronal: -" + ss_ep + "EUR");
        System.out.println("Valor a receber:" + valorfinal + "EUR");
        System.out.println("Valor total de encargos da empresa:" + (valor_lq+bonus+valor_sub+ss_ep) + "EUR\n");

            System.out.print ("Deseja continuar? S/N\n");
            opcao = input.next().charAt(0);
        }
        while ( opcao == 's');

        System.out.print ("Fim de execução");



        }
    }
