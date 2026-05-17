package Bank;

import java.util.List;
import java.util.ArrayList;

public class Banco {

    //variaveis
    private String ag;
    private List<Conta> contas;

    private int ultimaConta = 1;

    //construtor padrão
    public Banco(String ag) {
        this.ag = ag;
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    //inserir contas
    public void inserirConta(Conta conta) {
        contas.add(conta);
    }

    //gerar conta
    public Conta generateConta(String name){
        Conta conta = new Conta(ag, "" + ultimaConta , name);
        ultimaConta++;
        return conta;
    }

    //valor total no banco
    public void saidaTotal(){
        double total = 0;
        for (Conta conta : contas){
           double saldo = conta.getSaldo();
           total += saldo;
        }
        System.out.println("O banco possui um total de R$: " + total);

    }
}
