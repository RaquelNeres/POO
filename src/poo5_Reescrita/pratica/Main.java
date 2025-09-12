package poo5_Reescrita.pratica;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(15, 3, 1985);
        System.out.println("Data 1: " + data1.imprimir());

        Pessoa pessoa1 = new Pessoa("João Silva", data1, 'M', "123.456.789-10");

        Gerente gerente1 = new Gerente("Carlos Mendes", new Data(10, 12, 1980), 'M', "111.222.333-44", "G001");

        ContaCorrente cc1 = new ContaCorrente("CC001", pessoa1, gerente1, data1);

        // Testando operações da conta corrente
        cc1.depositar(1000.0);
        cc1.disponivel();
        cc1.sacar(500.0);
        cc1.sacar(800.0); // Vai usar o limite
        cc1.extrato();
        cc1.chequeEspecial(2.5);

        Poupanca poup1 = new Poupanca("P001", pessoa1, gerente1, data1);

        // Testando operações da poupança
        poup1.depositar(2000.0);
        poup1.disponivel();
        poup1.sacar(300.0);
        poup1.sacar(2000.0); // Deve falhar - saldo insuficiente
        poup1.extrato();
        poup1.rendimentos(0.5);

        // Testando transferências
        cc1.transferir(100.0, poup1);

        // Extratos finais
        System.out.println("\n=== EXTRATOS FINAIS ===");
        cc1.extrato();
        poup1.extrato();
    }
}
