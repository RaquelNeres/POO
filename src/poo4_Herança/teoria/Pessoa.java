package poo4_Herança.teoria;

public class Pessoa {
    String nome;
    String cpf;
    char sexo;
    Data dtNasc;

    public Pessoa(String nome, int idade, char sexo, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        // Apenas exemplo, gerando a data de nascimento fictícia
        this.dtNasc = new Data(1, 1, 2000 + (2025 - idade));
    }
}

