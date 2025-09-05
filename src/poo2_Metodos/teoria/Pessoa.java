package poo2_Metodos.teoria;

public class Pessoa {
    String nome;
    int idade;
    char sexo;
    String cpf;

    void aniversario() {
        // Adiciona um ano na idade da pessoa
        this.idade = this.idade + 1;
    }

    void atribuiCPF(String c) {
        // Altera o valor do atributo CPF
        this.cpf = c;
    }

    int getIdade() {
        // Retorna o valor da idade da pessoa
        return this.idade;
    }
}

