package poo5_Reescrita.pratica;

public class Poupanca extends Conta {

    public Poupanca(String numero, Pessoa titular, Gerente ger, Data criacao) {
        super(numero, titular, ger, criacao);
    }

    // herda extrato() de Conta

    public void rendimentos(double juro) {
        double rendimento = this.saldo * (juro / 100);
        this.saldo += rendimento;
        System.out.println("Rendimentos aplicados com sucesso. Taxa: " + juro + "% - Rendimento: R$" + rendimento + " - Novo saldo: R$" + this.saldo);
    }
}
