//import obrigatório do package para fazer a leitura das introduções dos dados de utilizador
import java.util.Scanner;

class FP05_Ex15 {
    public static void main(String[] args) {


        System.out.println("\n***** Ficha 5 - Exercicio 15 *****\n");

        //Instancia obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);


        //Declarar variáveis

        //Cargo do funcionário e opção de continuar a calcular como char uma vez que são caracteres únicos
        char cargo = 'c', opcao = 's';
        //Número de dias trabalhados e código de funcionário como números inteiros
        int dias = 0, codigo_f = 0;
        //Números reais: valor do IRS, descontos para a segurança social do funcionário e da empresa, valor liquido, valor do subsidio de alimentação, valor final a receber e bonus
        double irs = 0, ss_f = 0, ss_ep = 0, valor_lq = 0, valor_sub = 0, valorfinal = 0, bonus = 0;
        //Nome do funcionário e mês do ano como string de carateres
        String nome;
        String mes = "";
        //declaração do vetor dos meses do ano
        int arr[] = new int[12];
        //declaração da matriz que vai guardar nos 12 meses, os 6 calculos (valor iliquido, subsidio de alimentação, IRS, total Segurança social (func+emp), valor liquido, total de encargos da empresa
        double mat[][] = new double[12][6];


        do {
            // ler código do funcionário
            System.out.println("Insira código de funcionário ou -1 para sair:");
            codigo_f = input.nextInt();

            if (codigo_f == -1) {
                opcao = 'n';
            }

            if (opcao == 's' || opcao == 'S') {
                System.out.println("Insira o nome do funcionário ou 'X' para sair: ");
                nome = input.next().toString();
                if (nome == "x" || nome == "X") {
                    opcao = 'n';
                }
                do {
                    System.out.println("Insira o cargo do funcionário (E - Empregado; C - Chefe; A - Administrador) ou 'x' para sair:");
                    cargo = input.next().charAt(0);

                    if (cargo == 'x' || cargo == 'X') {
                        opcao = 'n';
                    }
                }
                while (cargo != 'a' && cargo != 'A' && cargo != 'c' && cargo != 'C' && cargo != 'E' && cargo != 'e' && cargo != 'X' && cargo != 'x');

                if (opcao == 's' || opcao == 'S') {


                    for (int i = 0; i < 12; i++) {
                        if (opcao == 's' || opcao == 'S') {
                            switch (i) {
                                case 0: {
                                    mes = "Janeiro";
                                    break;
                                }
                                case 1: {
                                    mes = "Fevereiro";
                                    break;
                                }
                                case 2: {
                                    mes = "Março";
                                    break;
                                }
                                case 3: {
                                    mes = "Abril";
                                    break;
                                }
                                case 4: {
                                    mes = "Maio";
                                    break;
                                }
                                case 5: {
                                    mes = "Junho";
                                    break;
                                }
                                case 6: {
                                    mes = "Julho";
                                    break;
                                }
                                case 7: {
                                    mes = "Agosto";
                                    break;
                                }
                                case 8: {
                                    mes = "Setembro";
                                    break;
                                }
                                case 9: {
                                    mes = "Outubro";
                                    break;
                                }
                                case 10: {
                                    mes = "Novembro";
                                    break;
                                }
                                case 11: {
                                    mes = "Dezembro";
                                    break;
                                }
                            }

                            System.out.println("Introduzir número de dias trabalhados no mês " + mes + " ou -1 para sair.");
                            mat[i][0] = input.nextInt();

                            if (mat[i][0] == -1) {
                                opcao = 'n';
                            }
                        }

                        for (int m = 0; m < 12; m++) {
                            mat[m][0] = dias;
                        }
                    }
                }

                if (opcao == 's' || opcao == 'S') {
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

                for (int i = 0; i < 12; i++) {
                    mat[i][1] = valor_lq;
                }

                for (int i = 0; i < 12; i++) {
                    mat[i][2] = valor_sub;
                }

                for (int i = 0; i < 12; i++) {
                    mat[i][3] = irs;
                }

                for (int i = 0; i < 12; i++) {
                    mat[i][4] = ss_f + ss_ep;
                }

                for (int i = 0; i < 12; i++) {
                    mat[i][5] = valorfinal;
                }

                for (int i = 0; i < 12; i++) {
                    mat[i][6] = bonus;
                }

                if (opcao == 's' || opcao == 'S') {
                    for (int i = 0; i < 12; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" " + mat[i][j]);
                        }
                        System.out.print("\n");
                    }

                        /*
                        System.out.println("\nVencimento base:" + (valor_lq+bonus) + "EUR");
                        System.out.println("Sub. alimentação:" + valor_sub + "EUR");
                        System.out.println("IRS: -" + irs + "EUR");
                        System.out.println("Retenção SS funcionário: -" + ss_f + "EUR");
                        System.out.println("Retenção SS entidade patronal: -" + ss_ep + "EUR");
                        System.out.println("Valor a receber:" + valorfinal + "EUR");
                        System.out.println("Valor total de encargos da empresa:" + (valor_lq+bonus+valor_sub+ss_ep) + "EUR\n");

                        System.out.print ("Deseja continuar? S/N\n");
                        opcao = input.next().charAt(0);
                    }*/
                }

            }
            while (opcao == 's' || opcao == 'S') ;

            System.out.print("Fim de execução");

        }while (opcao == 's' || opcao == 'S');
    }
    }



