package poo3_Construtores.pratica;

public class Pessoa {
    String nome;
    char sexo;
    String cpf;
    Data dtNasc;  // substitui idade

    // Construtor com parâmetros
    public Pessoa(String n, char s, String c, Data dtn) {
        System.out.println("Nova pessoa criada no sistema.");
        this.nome = n;
        this.sexo = s;
        this.cpf = c;
        this.dtNasc = dtn;
    }

    // Método para calcular idade a partir da data atual
    public int getIdade(Data hoje) {
        int idade = hoje.ano - this.dtNasc.ano;

        // Ajuste se o aniversário ainda não chegou neste ano
        if (hoje.mes < this.dtNasc.mes ||
                (hoje.mes == this.dtNasc.mes && hoje.dia < this.dtNasc.dia)) {
            idade--;
        }
        return idade;
    }
}
