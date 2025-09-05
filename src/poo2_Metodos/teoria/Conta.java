package poo2_Metodos.teoria;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    double limite;

    double disponivel() {
        return this.saldo + this.limite;
    }

    void extrato() {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Valor disponível para saque: " + this.disponivel() + "\n");
    }

    void sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Erro: nao foi possivel sacar R$" + valor);
            System.out.println("Valor disponivel para saque: R$" + this.disponivel());
        }
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + this.saldo);
    }

    void transferir(double valor, Conta destino) {
        if (valor <= this.disponivel()) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferencia de R$" + valor + " realizada com sucesso.");
            System.out.println("Origem: " + this.numero + " - Destino: " + destino.numero);
        } else {
            System.out.println("Erro: nao foi possivel transferir R$" + valor);
            System.out.println("Valor disponivel para transferencia: R$" + this.disponivel());
        }
    }
}

