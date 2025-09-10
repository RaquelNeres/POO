package poo4_Herança.pratica;

public class Pessoa {
    protected String nome;
    protected Data nasc;
    protected char sexo;
    protected String cpf;

    public Pessoa(String nome, Data nasc, char sexo, String cpf) {
        this.nome = nome;
        this.nasc = nasc;
        this.sexo = sexo;
        this.cpf = cpf;
        System.out.println("Pessoa criada com sucesso: " + this.nome);
    }

    public int idade(Data hoje) {
        int idade = hoje.getAno() - nasc.getAno();

        // Verifica se ainda não fez aniversário este ano
        if (hoje.getMes() < nasc.getMes() ||
                (hoje.getMes() == nasc.getMes() && hoje.getDia() < nasc.getDia())) {
            idade--;
        }

        System.out.println("Idade calculada com sucesso: " + idade + " anos");
        return idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Data getNasc() {
        return nasc;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }
}
