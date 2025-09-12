package poo5_Reescrita.pratica;

public class Pessoa {
    public String nome;
    public Data nasc;
    public char sexo;
    public String cpf;

    public Pessoa(String nome, Data nasc, char sexo, String cpf) {
        this.nome = nome;
        this.nasc = nasc;
        this.sexo = sexo;
        this.cpf = cpf;
        System.out.println("Pessoa criada com sucesso: " + this.nome);
    }

    public int idade(Data hoje) {
        int idade = hoje.ano - nasc.ano;

        // Verifica se ainda não fez aniversário este ano
        if (hoje.mes < nasc.mes || (hoje.mes == nasc.mes && hoje.dia < nasc.dia)) {
            idade--;
        }
        return idade;
    }

    @Override
    public String toString() {  // sobrescrevedo o toString()
        return nome;
    }

}