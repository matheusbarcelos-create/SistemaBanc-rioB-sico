package Bank;

public class Conta {

   //variáveis: vai para os construtores.

   private String ag; //
   private String acc;
   private String nome;

   private double saldo;

   private static final int LIMITE_LETRAS_NOME = 12;

   private Registro registros;

   //Objetos Conta.
   public Conta(String ag, String acc, String nome) {
      this.ag = ag;
      this.acc = acc;
      SETNome(nome);
      registros = new Registro();
   }

   //Construtor (SETTER) limite de 12 letras no nome.
   public void SETNome(String nome) {
      if (nome.length() > LIMITE_LETRAS_NOME) {
         this.nome = nome.substring(0, LIMITE_LETRAS_NOME);
      } else {
         this.nome = nome;
      }
      System.out.println(this.nome);
   }

   //Construtor do saque SE valor insuficiente.
   public boolean Saque(double saqueValor){
      //if (condição) restringe
      if (saldo < saqueValor){
         registros.out("SAQUES = R$ " + saldo + " Saldo insuficiente! Saldo atual: " + saldo + "");
         return false;
      }
         saldo = saldo - saqueValor;
      registros.out("SAQUES = R$ " + saldo + " Saldo atual R$: " + saldo);
         return true;
   }

   //Construtor para Depósitos.
   public void Deposito(double valor){
      saldo = saldo += valor;
      registros.out("DEPÓSITOS = R$ " + saldo + " Saldo atual R$: " + saldo);
   }

   public double getSaldo(){
      return saldo;
   }

   //Construtor para informar os dados da conta ao usuário.
   @Override
   public String toString() {
      String resultado = "Conta: " + this.nome + " " + this.ag + " / " + this.acc + " Possui: R$ " + saldo;
      return resultado;
   }
}
