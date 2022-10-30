import Model.ContaInvestimento;
import Model.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        int opcaoConta;

        ContaPoupanca contaPoupanca = null;
        ContaInvestimento contaInvestimento = null;

        do {
            System.out.println("1.Abrir Conta");
            System.out.println("2.Sacar");
            System.out.println("3.Depositar");
            System.out.println("4.Saldo");
            System.out.println("5.Sair");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Qual tipo de Conta?\n1.Poupancazn2.Investimento");
                opcaoConta = scanner.nextInt();

                if(opcaoConta == 1){
                    contaPoupanca = new ContaPoupanca();

                } else {
                    contaInvestimento = new ContaInvestimento();
                }

                System.out.println("Conta Criada com sucesso");
            } else if(opcao == 2){

            } else if(opcao == 3){

            } else if(opcao == 4){
                System.out.println("Qual tipo de Conta?\n1.Poupancazn2.Investimento");
                opcaoConta = scanner.nextInt();

                if(opcaoConta == 1){
                    System.out.println("Saldo da sua Conta Poupança é:" + contaPoupanca.getSaldo());

                } else {
                    System.out.println("Saldo da sua Conta Poupança é:" + contaInvestimento.getSaldo());
                }

            }

        }while (opcao != 5);

    }
}