import Model.ContaInvestimento;
import Model.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        int opcaoConta;
        double valorSaqueDeposito;

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
                System.out.println("Qual tipo de Conta?\n1.Poupança 2.Investimento");
                opcaoConta = scanner.nextInt();

                if(opcaoConta == 1){
                    contaPoupanca = new ContaPoupanca();

                } else {
                    contaInvestimento = new ContaInvestimento();
                }

                System.out.println("Conta Criada com sucesso");
            } else if(opcao == 2){
                System.out.println("Deseja sacar de qual conta?\n1.Poupança 2.Investimento");
                opcaoConta = scanner.nextInt();

                System.out.println("Deseja sacar qual quantia?");
                valorSaqueDeposito = scanner.nextDouble();

                if(opcaoConta == 1){
                    System.out.println(contaPoupanca.sacar(valorSaqueDeposito));

                } else {
                    System.out.println(contaInvestimento.sacar(valorSaqueDeposito));
                }

            } else if(opcao == 3){
                System.out.println("Deseja depositar em qual conta?\n1.Poupança 2.Investimento");
                opcaoConta = scanner.nextInt();

                System.out.println("Deseja depositar qual quantia?");
                valorSaqueDeposito = scanner.nextDouble();

                if(opcaoConta == 1){
                    System.out.println("Depósito realizado com sucesso na conta poupança!" + "\nSeu saldo agora é de " + contaPoupanca.depositar(valorSaqueDeposito));

                } else {
                    System.out.println("Depósito realizado com sucesso na conta investimento!" + "\nSeu saldo agora é de " + contaPoupanca.depositar(valorSaqueDeposito));
                }

            } else if(opcao == 4){
                System.out.println("Qual tipo de Conta?\n1.Poupança 2.Investimento");
                opcaoConta = scanner.nextInt();

                if(opcaoConta == 1){
                    System.out.println("Saldo da sua Conta Poupança é:" + contaPoupanca.getSaldo());

                } else {
                    System.out.println("Saldo da sua Conta Investimento é:" + contaInvestimento.getSaldo());
                }

            }

        }while (opcao != 5);

    }
}