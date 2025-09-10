package poo4_Herança.pratica;

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
        System.out.println("Conta criada com sucesso: " + this.numero + " - Titular: " + this.titular.getNome());
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
    public abstract double disponivel();
    public abstract void extrato();
    public abstract boolean sacar(double valor);

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

    // Getters
    public String getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public Data getCriacao() {
        return criacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public Gerente getGer() {
        return ger;
    }
}
