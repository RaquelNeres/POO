package poo1_Class_Objects.teoria;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Hilario";
        p1.cpf = "123.456.789-00";
        p1.idade = 18;
        p1.sexo = 'M';

        Pessoa p2 = new Pessoa();
        p2.nome = "Alessandra";
        p2.cpf = "234.567.890-00";
        p2.idade = 21;
        p2.sexo = 'F';

        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.titular = p1; // Conta pertencente ao Hilario
        c1.saldo = 100.0;
        c1.limite = 200.0;

        Conta c2 = new Conta();
        c2.numero = "2345-6";
        c2.titular = p2; // Conta da Alessandra
        c2.saldo = 150.0;
        c2.limite = 200.0;

        System.out.println("A conta " + c1.numero + " pertence a " + c1.titular.nome);
    }
}


