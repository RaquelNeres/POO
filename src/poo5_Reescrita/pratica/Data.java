package poo5_Reescrita.pratica;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String imprimir() {
        return String.format(dia + "/" + mes + "/" + ano);
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
}
