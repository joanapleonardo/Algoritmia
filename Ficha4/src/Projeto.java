import java.util.Scanner;

class Projeto{
    public static void main(String[] args) {
        System.out.println("\n***** Projeto Prático *****\n");

        //Instância obrigatória da classe para fazer a leitura das introduções dos dados de utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int n_quarto, n_dias, limpeza=0, valor=0, lucro;
        double descontos=0;
        char tipo;

        System.out.println("Insira número do quarto: ");
        n_quarto = input.nextInt();


        //ciclo que garante que o tipo de quarto é válido
        do {
            System.out.println("Insira tipo de quarto. I - Individual, D -Duplo, T - Triplo, S - Suite. ");
            //Permitir introduçáo de minúsculas ou maiúsculas
            tipo = Character.toUpperCase(input.next().charAt(0));
        }while(tipo != 'I' && tipo != 'D' && tipo != 'T' && tipo != 'S');


        //ciclo que garante que número de dias é maior que zero e menor ou igual a 365
        do{
            System.out.println("Inserir número de dias em que o quarto esteve alugado no ano: ");
            n_dias = input.nextInt();
        }while(n_dias < 0 || n_dias > 365);


        //cálculo do valor de reserva e limpeza, de acrodo com o tipo de quarto
        switch (tipo){
            case 'I':{
                valor = (200 * n_dias);
                limpeza = (25 * n_dias);
                break;
            }
            case 'D':{
                valor = (250 * n_dias);
                limpeza = (30 * n_dias);
                break;
            }
            case 'T':{
                valor = (275 * n_dias);
                limpeza = (30 * n_dias);
                break;
            }
            case 'S':{
                valor = (350 * n_dias);
                limpeza = (50 * n_dias);
                break;
            }
        }

        //cálculo do valor ilíquido
        lucro = (valor - limpeza);


        //cálculo do desconto fiscal, de acordo com o valor ilíquido
        if (lucro <= 20000){
            descontos = (lucro * 0.23);
        }
        else if (lucro > 20000 && lucro <= 50000){
            descontos = (lucro * 0.25);
        }
        else {
            descontos = (lucro * 0.28);
        }

        //apresentação dos dados
        System.out.println("Valor total das reservas: " + valor);
        System.out.println("Valor total do custo da limpeza: " + limpeza);
        System.out.println("Valor dos descontos fiscais: " + descontos);
        System.out.println("Valor liquido a receber pelo quarto: " + (valor - limpeza - descontos));

        }
    }