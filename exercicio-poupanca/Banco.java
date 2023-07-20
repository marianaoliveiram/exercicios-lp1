public class Banco{
    public static void main(String[] args){
        Cliente c1 = new Cliente("Mariana","858.786.385-17");
        Cliente c2 = new Cliente("Renata", "000.327.625-26");
        DataAniversario d1 = new DataAniversario(18, "Janeiro", 2003);
        DataAniversario d2 = new DataAniversario(27, "Novembro", 1977);
        Conta co1 = new Conta("789-1", 50.00, c1);
        Poupanca p1 = new Poupanca("123-4", 60.00, c1, d1);
        Poupanca p2 = new Poupanca("654-7", 250.0, c2, d2);
        Repositorio BD = new Repositorio();

        BD.inserir(co1);
        co1.creditar(90.0);
        BD.inserir(p1);
        p1.creditar(50.0);
        p1.renderjuros(0.01);
        BD.inserir(p2);
        p2.creditar(50.0);
        p2.renderjuros(0.01);
        //BD.remover(p1);
        BD.imprimir();
    }
}