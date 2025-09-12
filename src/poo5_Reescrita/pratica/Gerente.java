package poo5_Reescrita.pratica;

public class Gerente extends Pessoa {
    public String matricula;
    public String senha = "123456";

    public Gerente(String nome, Data nasc, char sexo, String cpf, String matricula) {
        super(nome, nasc, sexo, cpf);
        this.matricula = matricula;
    }

    public boolean validarAcesso(String s) {
        boolean acesso = this.senha.equals(s);  // compara senha com s,
                                                // essa comparação ja retorna um valor booleano

        if (acesso) {
            System.out.println("Acesso validado com sucesso para o gerente: " + this.nome);
        } else {
            System.out.println("Falha na validação do acesso para o gerente: " + this.nome);
        }
        return acesso;
    }

}
