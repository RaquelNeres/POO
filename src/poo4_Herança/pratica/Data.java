package poo4_Herança.pratica;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        System.out.println("Data criada com sucesso: " + this.imprimir());
    }

    public String imprimir() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public boolean maior(Data d2) {
        if (this.ano > d2.ano) {
            return true;
        } else if (this.ano == d2.ano) {
            if (this.mes > d2.mes) {
                return true;
            } else if (this.mes == d2.mes) {
                return this.dia > d2.dia;
            }
        }
        return false;
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
