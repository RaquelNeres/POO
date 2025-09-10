package poo4_Herança.pratica;

public class Gerente extends Pessoa {
    private String matricula;
    private String senha;

    public Gerente(String nome, Data nasc, char sexo, String cpf, String matricula, String senha) {
        super(nome, nasc, sexo, cpf);
        this.matricula = matricula;
        this.senha = senha;
        System.out.println("Gerente criado com sucesso: " + this.nome + " - Matrícula: " + this.matricula);
    }

    public boolean validarAcesso(String s) {
        boolean acesso = this.senha.equals(s);
        if (acesso) {
            System.out.println("Acesso validado com sucesso para o gerente: " + this.nome);
        } else {
            System.out.println("Falha na validação do acesso para o gerente: " + this.nome);
        }
        return acesso;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }
}
