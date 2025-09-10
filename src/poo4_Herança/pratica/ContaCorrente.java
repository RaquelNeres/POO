package poo4_Herança.pratica;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Pessoa titular, Gerente ger, Data criacao) {
        super(numero, titular, ger, criacao);
        this.limite = 200.0;
        System.out.println("Conta Corrente criada com limite de R$" + this.limite);
    }

    @Override
    public double disponivel() {
        double disponivel = this.saldo + this.limite;
        System.out.println("Valor disponível calculado: R$" + disponivel);
        return disponivel;
    }

    @Override
    public void extrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Gerente: " + this.ger.getNome());
        System.out.println("Data de criação: " + this.criacao.imprimir());
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Limite: R$" + this.limite);
        System.out.println("Disponível: R$" + this.disponivel());
        System.out.println("===============================");
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Valor: R$" + valor + " - Novo saldo: R$" + this.saldo);
            return true;
        } else {
            System.out.println("Erro: Saque não realizado - valor inválido ou saldo insuficiente");
            return false;
        }
    }

    public void chequeEspecial(double juro) {
        if (this.saldo < 0) {
            double juros = Math.abs(this.saldo) * (juro / 100);
            this.saldo -= juros;
            System.out.println("Juros do cheque especial aplicados com sucesso. Taxa: " + juro + "% - Juros: R$" + juros + " - Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Cheque especial não aplicado - conta não está no negativo");
        }
    }

    // Getter
    public double getLimite() {
        return limite;
    }
}
