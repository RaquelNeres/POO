package poo5_Reescrita.pratica;

public abstract class Conta {
    protected String numero;
    protected Pessoa titular;
    protected Data criacao;
    protected double saldo;
    protected Gerente ger;

    public Conta(String numero, Pessoa titular, Gerente ger, Data criacao) {
        this.numero = numero;
        this.titular = titular;
        this.ger = ger;
        this.criacao = criacao;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso. Valor: R$" + valor + " - Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Erro: Valor de depósito deve ser positivo");
        }
    }

    // Métodos abstratos que serão implementados pelas subclasses
    public double disponivel() {
        System.out.println("Valor disponível na poupança: R$" + this.saldo);
        return this.saldo;
    }

    public void extrato (){
        System.out.println("=== EXTRATO POUPANÇA ===");
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Gerente: " + this.ger);
        System.out.println("Data de criação: " + this.criacao.imprimir());
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("========================");
    }

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

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso de " + this.numero + " para " + destino.numero);
            return true;
        } else {
            System.out.println("Erro: Falha na transferência - saldo insuficiente");
            return false;
        }
    }
}
