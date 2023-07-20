public class DataAniversario{
    private int dia;
    private String mes;
    private int ano;

    public DataAniversario(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public void imprimir(){
        System.out.println("Data de aniversário: " + dia + " de " + mes + " de " + ano);
        System.out.println("-----------");
    }
}