//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP04_Ex05 {
    public static void main(String[] args) {


        System.out.println("\n***** Ficha 4 - Exercicio 5 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        char cargo = 'c', opcao = 's';
        int dias = 0, codigo_f = 0;
        double irs = 0, ss_f = 0, ss_ep = 0, valor_lq = 0, valor_sub = 0, valorfinal = 0, bonus = 0;
        //Boolean flag_exit = false;


        do{
            // ler código do funcionário
            System.out.println("Insira código de funcionário ou -1 para sair:");
            codigo_f = input.nextInt();

            if(codigo_f == -1)
            {
                opcao = 'n';
            }

            if(opcao == 's' || opcao == 'S')
            {
                do
                {
                    System.out.println("Insira o cargo do funcionário (E - Empregado; C - Chefe; A - Administrador) ou 'x' para sair:");
                    cargo = input.next().charAt(0);

                    if(cargo == 'x' || cargo == 'X')
                    {
                        opcao = 'n';
                    }
                }
                while (cargo!='a' && cargo!='A' && cargo!='c' && cargo!='C' && cargo!='E' && cargo!='e' && cargo!='X' && cargo!='x');
            }


            if(opcao == 's' || opcao == 'S') {


                // ler dias trabalhados
                System.out.println("Insira nº de dias trabalhados ou -1 para sair:");
                dias = input.nextInt();

                if(dias == -1)
                {
                    opcao = 'n';
                }

                if(opcao == 's' || opcao == 'S') {
                    //Calcular
                    switch (cargo) {
                        case 'E':
                        case 'e': {
                            valor_lq = 40 * dias;
                            valor_sub = 5 * dias;
                            if (dias > 20) {
                                bonus = valor_lq * 0.05;
                            } else if (dias > 17 && dias <= 20) {
                                bonus = valor_lq * 0.02;
                            } else if (dias <= 17) {
                                bonus = 0;
                            }
                            ss_f = (valor_lq + valor_sub) * 0.11;
                            ss_ep = (valor_lq + valor_sub) * 0.2375;
                            if (valor_lq < 1000) {
                                irs = (valor_lq + valor_sub + bonus) * 0.1;
                            } else if (valor_lq >= 1000 && valor_lq < 2500) {
                                irs = (valor_lq + valor_sub + bonus) * 0.2;
                            } else if (valor_lq >= 2500) {
                                irs = (valor_lq + valor_sub + bonus) * 0.3;
                            }
                            valorfinal = (valor_lq + valor_sub + bonus) - irs - ss_f;
                            break;
                        }
                        case 'C':
                        case 'c': {
                            valor_lq = 60 * dias;
                            valor_sub = 7.5 * dias;
                            if (dias > 20) {
                                bonus = valor_lq * 0.05;
                            } else if (dias > 17 && dias <= 20) {
                                bonus = valor_lq * 0.02;
                            } else if (dias <= 17) {
                                bonus = 0;
                            }
                            ss_f = (valor_lq + valor_sub) * 0.11;
                            ss_ep = (valor_lq + valor_sub) * 0.2375;
                            if (valor_lq < 1000) {
                                irs = (valor_lq + valor_sub + bonus) * 0.1;
                            } else if (valor_lq >= 1000 && valor_lq < 2500) {
                                irs = (valor_lq + valor_sub + bonus) * 0.2;
                            } else if (valor_lq >= 2500) {
                                irs = (valor_lq + valor_sub + bonus) * 0.3;
                            }
                            valorfinal = (valor_lq + valor_sub + bonus) - irs - ss_f;
                            break;
                        }
                        case 'A':
                        case 'a': {
                            valor_lq = 80 * dias;
                            valor_sub = 7.5 * dias;
                            if (dias > 20) {
                                bonus = valor_lq * 0.05;
                            } else if (dias > 17 && dias <= 20) {
                                bonus = valor_lq * 0.02;
                            } else if (dias <= 17) {
                                bonus = 0;
                            }
                            ss_f = (valor_lq + valor_sub) * 0.09;
                            ss_ep = (valor_lq + valor_sub) * 0.21;
                            if (valor_lq < 1000) {
                                irs = (valor_lq + valor_sub + bonus) * 0.1;
                            } else if (valor_lq >= 1000 && valor_lq < 2500) {
                                irs = (valor_lq + valor_sub + bonus) * 0.2;
                            } else if (valor_lq >= 2500) {
                                irs = (valor_lq + valor_sub + bonus) * 0.3;
                            }
                            valorfinal = (valor_lq + valor_sub + bonus) - irs - ss_f;
                            break;
                        }
                    }
                }
            }

            if(opcao == 's' || opcao == 'S')
            {
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
        }
        while (opcao == 's' || opcao == 'S');

        System.out.print ("Fim de execução");



        }
    }
