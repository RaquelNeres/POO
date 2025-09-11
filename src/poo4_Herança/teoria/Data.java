package poo4_Herança.teoria;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override  // Indica que estamos sobrescrevendo o método da classe pai
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

