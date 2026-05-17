package Bank;

import java.util.List;
import java.util.Scanner;


public  class App {

    public static void main(String[] args) {

        //depositar, sacar, sair.
        Scanner sc = new Scanner(System.in);

        //bancos
        Banco nubank = new Banco("00341");

        //C CRIAR CONTA
        //X SAIR DE UM LOOP
        while (true) {
            System.out.println("O que deseja fazer? C=Criar uma conta , X=Sair ");
            String operacao = sc.nextLine();

            if (operacao.equals("C")) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                Conta conta = nubank.generateConta(nome);
                nubank.inserirConta(conta);

                operacaoConta(conta);

            } else if (operacao.equals("X")) {
                System.out.println(" Finalizando o programa! até breve!! ");
                break;
                } else {
                System.out.println("COMANDO INVALIDO!");
            }
        }

        List<Conta> contaLista = nubank.getContas();
        for(Conta cc : contaLista){
            System.out.println(cc);
        }

        nubank.saidaTotal();
    }

    static void operacaoConta(Conta conta) {
        Scanner sc = new Scanner(System.in);
        // D = deposito
        // S = saque
        // X = sair
        while (true) {
            System.out.println("Qual operação deseja? D=Depositar , S=Saque , X=Sair");
            String operacao = sc.nextLine();

            if (operacao.equals("D")) {
                System.out.println(" Qual valor do depósito: ");
                double valor = sc.nextDouble();
                conta.Deposito(valor);
                System.out.println(" O depósito de R$: " + valor + " Foi um sucesso!");
            }

            else if (operacao.equals("S")) {
                System.out.println(" Qual valor do saque: ");
                double valor =  sc.nextDouble();
                if (!conta.Saque(valor)) {
                    System.out.println(" O saque de R$: " + valor + " Falhou! saldo insuficiente!");
                }

            } else if (operacao.equals("X")) {
                System.out.println(" Finalizando o programa! até breve!! ");
                break;

            } else {
                System.out.println("COMANDO INVALIDO!");
            }

            sc = new Scanner(System.in);

        }

    }
    }
