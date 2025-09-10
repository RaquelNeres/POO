package poo4_Herança.pratica;

public class Poupanca extends Conta {

    public Poupanca(String numero, Pessoa titular, Gerente ger, Data criacao) {
        super(numero, titular, ger, criacao);
        System.out.println("Poupança criada com sucesso");
    }

    @Override
    public double disponivel() {
        System.out.println("Valor disponível na poupança: R$" + this.saldo);
        return this.saldo;
    }

    @Override
    public void extrato() {
        System.out.println("=== EXTRATO POUPANÇA ===");
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Gerente: " + this.ger.getNome());
        System.out.println("Data de criação: " + this.criacao.imprimir());
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("========================");
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Valor: R$" + valor + " - Novo saldo: R$" + this.saldo);
            return true;
        } else {
            System.out.println("Erro: Saque não realizado - valor inválido ou saldo insuficiente");
            return false;
        }
    }

    public void rendimentos(double juro) {
        double rendimento = this.saldo * (juro / 100);
        this.saldo += rendimento;
        System.out.println("Rendimentos aplicados com sucesso. Taxa: " + juro + "% - Rendimento: R$" + rendimento + " - Novo saldo: R$" + this.saldo);
    }
}
