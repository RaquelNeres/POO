package poo4_Herança.teoria;

public class ContaCorrente extends Conta {
    double limite;

    ContaCorrente(String numero, Pessoa titular, Data c) {
        super(numero, titular, c);  // Chama o construtor de Conta, o mesmo da class Conta aqui
        this.limite = 200;
    }

    double disponivel() {
        return this.saldo + this.limite;
    }

    boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.numero +
                    " realizado com sucesso. Novo saldo: " + this.saldo);
            return true;
        } else {
            System.out.println("ERRO: Saque na conta " + this.numero +
                    " não foi realizado. Valor disponível: " + this.disponivel());
            return false;
        }
    }
}

