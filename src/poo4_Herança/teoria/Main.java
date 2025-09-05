package poo4_Herança.teoria;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 18, 'F', "123.456.789-00");
        Pessoa p2 = new Pessoa("Joao", 22, 'M', "234.567.890-00");

        ContaCorrente c1 = new ContaCorrente("1234-5", p1, new Data(12, 3, 2019));
        ContaCorrente c2 = new ContaCorrente("2345-6", p2, new Data(13, 3, 2019));

        c1.sacar(150);
        c1.sacar(100);
        c1.depositar(100);
    }
}
