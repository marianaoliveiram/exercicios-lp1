public class App {
    public static void main(String[] args) throws Exception {
        
        Assalariado a1 = new Assalariado("Jorge", "Moraes", "789.456.123-85", 5000);
        Comissionado c1 = new Comissionado("Renata", "Leal", "000.327.625-26", 50000, 0.10);
        Horista h1 = new Horista("Mariana", "Oliveira", "858.786.385-17", 35.00, 80);

        Repositorio BD = new Repositorio();

        BD.inserir(a1);
        BD.inserir(c1);
        BD.inserir(h1);
        BD.vencimento();
    }
}
