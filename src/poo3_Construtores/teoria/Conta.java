package poo3_Construtores.teoria;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    double limite;

    // Construtor com número e titular
    Conta(String n, Pessoa t) {
        this.numero = n;
        this.titular = t;
        this.saldo = 0;
        this.limite = 200;
    }

    // Construtor com número, titular e limite
    Conta(String n, Pessoa t, double l) {
        this(n, t); // chama o construtor anterior
        this.limite = l;
    }

    double disponivel() {
        return this.saldo + this.limite;
    }

    void extrato() {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Valor disponível para saque: " + this.disponivel() + "\n");
    }

    boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Novo saldo: R$" + this.saldo);
            return true;
        } else {
            System.out.println("Erro: nao foi possivel sacar R$" + valor);
            System.out.println("Valor disponivel para saque: R$" + this.disponivel());
            return false;
        }
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + this.saldo);
    }

    boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferencia de R$" + valor + " realizada com sucesso.");
            System.out.println("Origem: " + this.numero + " - Destino: " + destino.numero);
            return true;
        } else {
            System.out.println("Erro: nao foi possivel transferir R$" + valor);
            System.out.println("Valor disponivel para transferencia: R$" + this.disponivel());
            return false;
        }
    }

    void chequeEspecial(double juro) {
        if (this.saldo < 0) {
            double valorJuro = this.saldo * juro;
            System.out.println("Cheque especial utilizado. Juros aplicados: R$" + valorJuro);
            this.saldo += valorJuro; // saldo é negativo, então juros aumentam a dívida
        } else {
            System.out.println("Nenhum cheque especial utilizado.");
        }
    }
}
