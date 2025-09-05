package poo4_Herança.teoria;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;

    public Conta(String numero, Pessoa titular, Data c) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.criacao = c;
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito na conta " + this.numero +
                " realizado com sucesso. Novo saldo: " + this.saldo);
    }
}

