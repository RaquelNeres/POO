package poo3_Construtores.teoria;

public class Pessoa {
    String nome;
    int idade;
    char sexo;
    String cpf;

    // Construtor padrão (sem parâmetros)
    Pessoa() {
        System.out.println("Nova pessoa criada no sistema.");
    }

    // Construtor com parâmetros
    Pessoa(String n, int i, char s, String c) {
        System.out.println("Nova pessoa criada no sistema.");
        this.nome = n;
        this.idade = i;
        this.sexo = s;
        this.cpf = c;
    }

    // Métodos da classe
    void aniversario() {
        this.idade++;
    }

    void atribuiCPF(String c) {
        this.cpf = c;
    }

    int getIdade() {
        return this.idade;
    }
}
