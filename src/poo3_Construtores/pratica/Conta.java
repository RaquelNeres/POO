package poo3_Construtores.pratica;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    double limite;

    // Construtor com número e titular
    public Conta(String numero, Pessoa titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.limite = 200.0;
        System.out.println("Nova conta adicionada ao sistema.");
    }

    double disponivel() {
        return this.saldo + this.limite;
    }

    void extrato() {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("Valor disponível para saque: " + this.disponivel() + "\n");
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado.");
    }

    boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para sacar R$" + valor);
            return false;
        }
    }

    boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para conta " + destino.numero);
            return true;
        }
        return false;
    }

    void chequeEspecial(double juro) {
        if (this.saldo < 0) {
            this.saldo = this.saldo + (juro * this.saldo) / 100;
        }
    }
}

