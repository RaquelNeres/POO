package poo3_Construtores.pratica;

public class Data {
    int dia;
    int mes;
    int ano;

    // Construtor
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    // Método para imprimir no formato D/M/A
    public void imprimir() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
