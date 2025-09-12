package poo5_Reescrita.pratica;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCO MAIS - TESTE DE HERANÇA ===\n");

        // Criando datas
        Data data1 = new Data(15, 3, 1985);
        Data data2 = new Data(22, 7, 1990);

        System.out.println("\n=== TESTANDO CLASSE DATA ===");
        System.out.println("Data 1: " + data1.imprimir());

        // Criando pessoas
        System.out.println("\n=== TESTANDO CLASSE PESSOA ===");
        Pessoa pessoa1 = new Pessoa("João Silva", data1, 'M', "123.456.789-10");
        Pessoa pessoa2 = new Pessoa("Maria Santos", data2, 'F', "987.654.321-00");

        // Criando gerentes
        System.out.println("\n=== TESTANDO CLASSE GERENTE ===");
        Gerente gerente1 = new Gerente("Carlos Mendes", new Data(10, 12, 1980), 'M', "111.222.333-44", "G001");
        Gerente gerente2 = new Gerente("Ana Costa", new Data(5, 8, 1975), 'F', "555.666.777-88", "G002");

        // Criando contas correntes
        System.out.println("\n=== TESTANDO CLASSE CONTA CORRENTE ===");
        ContaCorrente cc1 = new ContaCorrente("CC001", pessoa1, gerente1, data1);

        // Testando operações da conta corrente
        System.out.println("\nTestando operações Conta Corrente 1:");
        cc1.depositar(1000.0);
        cc1.disponivel();
        cc1.sacar(500.0);
        cc1.sacar(800.0); // Vai usar o limite
        cc1.extrato();
        cc1.chequeEspecial(2.5);

        // Criando poupanças
        System.out.println("\n=== TESTANDO CLASSE POUPANÇA ===");
        Poupanca poup1 = new Poupanca("P001", pessoa1, gerente1, data2);

        // Testando operações da poupança
        System.out.println("\nTestando operações Poupança 1:");
        poup1.depositar(2000.0);
        poup1.disponivel();
        poup1.sacar(300.0);
        poup1.sacar(2000.0); // Deve falhar - saldo insuficiente
        poup1.extrato();
        poup1.rendimentos(0.5);

        // Testando transferências
        System.out.println("\n=== TESTANDO TRANSFERÊNCIAS ===");
        System.out.println("Transferindo R$500 da CC1 para CC2:");
        cc1.transferir(500.0, cc1);

        System.out.println("Transferindo R$200 da Poupança 1 para Poupança 2:");
        poup1.transferir(200.0, poup1);

        System.out.println("Transferindo R$100 da CC2 para Poupança 1:");
        cc1.transferir(100.0, poup1);

        // Extratos finais
        System.out.println("\n=== EXTRATOS FINAIS ===");
        cc1.extrato();
        poup1.extrato();

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
