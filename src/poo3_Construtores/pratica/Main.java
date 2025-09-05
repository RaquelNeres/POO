package poo3_Construtores.pratica;

public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(15, 3, 2005);  // nascimento da Maria
        Data d2 = new Data(7, 11, 2002);  // nascimento do Joao

        Pessoa p1 = new Pessoa("Maria", 'F', "123.456.789-00", d1);
        Pessoa p2 = new Pessoa("Joao", 'M', "234.567.890-00", d2);

        Conta c1 = new Conta("1234-5", p1);
        Conta c2 = new Conta("2345-6", p2);

        // Extratos iniciais
        c1.extrato();
        c2.extrato();

        // Operações
        c1.sacar(150);
        c1.transferir(100, c2);
        c1.sacar(100);
        c1.depositar(100);
        c1.transferir(200, c2);

        // Testando cheque especial por 120 dias
        for (int i = 1; i <= 120; i++) {
            c1.chequeEspecial(0.5);

            if (i % 30 == 0) {
                System.out.println("Saldo após " + i + " dias: " + c1.saldo);
            }
        }

        // Testando cálculo de idade
        Data hoje = new Data(5, 9, 2025);
        System.out.println("Idade de " + p1.nome + ": " + p1.getIdade(hoje));
        System.out.println("Idade de " + p2.nome + ": " + p2.getIdade(hoje));
    }
}

