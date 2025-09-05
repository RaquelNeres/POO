package poo3_Construtores.teoria;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 18, 'F', "123.456.789-00");
        Pessoa p2 = new Pessoa("Joao", 22, 'M', "234.567.890-00");

        Conta c1 = new Conta("1234-5", p1);
        Conta c2 = new Conta("2345-6", p2, 0);

        c1.sacar(30);
        c2.sacar(100);
        c2.depositar(50);
        c1.transferir(200, c2);

        System.out.println("Saldo final da conta " + c2.numero + ": R$" + c2.saldo);
    }
}

