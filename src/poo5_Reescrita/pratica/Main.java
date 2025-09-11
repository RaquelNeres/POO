package poo5_Reescrita.pratica;

import poo4_Herança.pratica.ContaCorrente;
import poo4_Herança.pratica.Data;
import poo4_Herança.pratica.Gerente;
import poo4_Herança.pratica.Pessoa;
import poo4_Herança.pratica.Poupanca;

public class Main {
    static void main(String[] args) {
        System.out.println("=== SISTEMA BANCO MAIS - TESTE DE HERANÇA ===\n");

        // Criando datas
        poo4_Herança.pratica.Data data1 = new poo4_Herança.pratica.Data(15, 3, 1985);
        poo4_Herança.pratica.Data data2 = new poo4_Herança.pratica.Data(22, 7, 1990);
        poo4_Herança.pratica.Data dataHoje = new poo4_Herança.pratica.Data(10, 9, 2025);
        poo4_Herança.pratica.Data dataCriacao1 = new poo4_Herança.pratica.Data(1, 1, 2023);
        poo4_Herança.pratica.Data dataCriacao2 = new poo4_Herança.pratica.Data(15, 6, 2024);

        System.out.println("\n=== TESTANDO CLASSE DATA ===");
        System.out.println("Data 1: " + data1.imprimir());
        System.out.println("Data 2: " + data2.imprimir());
        System.out.println("Data1 é maior que Data2? " + data1.maior(data2));
        System.out.println("Data2 é maior que Data1? " + data2.maior(data1));

        // Criando pessoas
        System.out.println("\n=== TESTANDO CLASSE PESSOA ===");
        poo4_Herança.pratica.Pessoa pessoa1 = new poo4_Herança.pratica.Pessoa("João Silva", data1, 'M', "123.456.789-10");
        poo4_Herança.pratica.Pessoa pessoa2 = new Pessoa("Maria Santos", data2, 'F', "987.654.321-00");

        // Testando idade
        System.out.println("Idade de " + pessoa1.getNome() + ": " + pessoa1.idade(dataHoje) + " anos");
        System.out.println("Idade de " + pessoa2.getNome() + ": " + pessoa2.idade(dataHoje) + " anos");

        // Criando gerentes
        System.out.println("\n=== TESTANDO CLASSE GERENTE ===");
        poo4_Herança.pratica.Gerente gerente1 = new poo4_Herança.pratica.Gerente("Carlos Mendes", new poo4_Herança.pratica.Data(10, 12, 1980), 'M', "111.222.333-44", "G001", "senha123");
        poo4_Herança.pratica.Gerente gerente2 = new Gerente("Ana Costa", new Data(5, 8, 1975), 'F', "555.666.777-88", "G002", "minhasenha");

        // Testando validação de acesso
        System.out.println("Testando acesso do gerente 1:");
        gerente1.validarAcesso("senha123");
        gerente1.validarAcesso("senhaerrada");

        System.out.println("Testando acesso do gerente 2:");
        gerente2.validarAcesso("minhasenha");
        gerente2.validarAcesso("123456");

        // Criando contas correntes
        System.out.println("\n=== TESTANDO CLASSE CONTA CORRENTE ===");
        poo4_Herança.pratica.ContaCorrente cc1 = new poo4_Herança.pratica.ContaCorrente("CC001", pessoa1, gerente1, dataCriacao1);
        poo4_Herança.pratica.ContaCorrente cc2 = new ContaCorrente("CC002", pessoa2, gerente2, dataCriacao2);

        // Testando operações da conta corrente
        System.out.println("\nTestando operações Conta Corrente 1:");
        cc1.depositar(1000.0);
        cc1.disponivel();
        cc1.sacar(500.0);
        cc1.sacar(800.0); // Vai usar o limite
        cc1.extrato();
        cc1.chequeEspecial(2.5);

        System.out.println("\nTestando operações Conta Corrente 2:");
        cc2.depositar(1500.0);
        cc2.sacar(200.0);
        cc2.extrato();

        // Criando poupanças
        System.out.println("\n=== TESTANDO CLASSE POUPANÇA ===");
        poo4_Herança.pratica.Poupanca poup1 = new poo4_Herança.pratica.Poupanca("P001", pessoa1, gerente1, dataCriacao1);
        poo4_Herança.pratica.Poupanca poup2 = new Poupanca("P002", pessoa2, gerente2, dataCriacao2);

        // Testando operações da poupança
        System.out.println("\nTestando operações Poupança 1:");
        poup1.depositar(2000.0);
        poup1.disponivel();
        poup1.sacar(300.0);
        poup1.sacar(2000.0); // Deve falhar - saldo insuficiente
        poup1.extrato();
        poup1.rendimentos(0.5);

        System.out.println("\nTestando operações Poupança 2:");
        poup2.depositar(5000.0);
        poup2.rendimentos(1.0);
        poup2.sacar(1000.0);
        poup2.extrato();

        // Testando transferências
        System.out.println("\n=== TESTANDO TRANSFERÊNCIAS ===");
        System.out.println("Transferindo R$500 da CC1 para CC2:");
        cc1.transferir(500.0, cc2);

        System.out.println("Transferindo R$200 da Poupança 1 para Poupança 2:");
        poup1.transferir(200.0, poup2);

        System.out.println("Transferindo R$100 da CC2 para Poupança 1:");
        cc2.transferir(100.0, poup1);

        // Extratos finais
        System.out.println("\n=== EXTRATOS FINAIS ===");
        cc1.extrato();
        cc2.extrato();
        poup1.extrato();
        poup2.extrato();

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
