package poo5_Reescrita.pratica;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Pessoa titular, Gerente ger, Data criacao) {
        super(numero, titular, ger, criacao);
        this.limite = 200.0;
    }

    public void alterarLimite(String pwd, double l) {
        if (pwd.equals(ger.senha)) {
            this.limite = l;
            System.out.println("Limite alterado para R$" + this.limite);
        } else {
            System.out.println("Senha incorreta! Limite não alterado.");
        }
    }

    // herda disponivel() de Conta

    // herda extrato() de Conta

    public void chequeEspecial(double juro) {
        if (this.saldo < 0) {
            double juros = Math.abs(this.saldo) * (juro / 100);
            this.saldo -= juros;
            System.out.println("Juros do cheque especial aplicados com sucesso. Taxa: " + juro + "% - Juros: R$" + juros + " - Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Cheque especial não aplicado - conta não está no negativo");
        }
    }
}
