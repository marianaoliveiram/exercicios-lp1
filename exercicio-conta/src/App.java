public class App {
    public static void main(String[] args) throws Exception {
         
        Pessoa p1 = new Pessoa("Mariana Oliveira", "Caminho 16, 34 - Zabelê", "Vitória da Conquista", "Bahia", "858.786.385-17");
        Pessoa p2 = new Pessoa("Renata Leal", "Caminho 16, 34 - Zabelê", "Vitória da Conquista", "Bahia", "000.326.625-26");
        Poupanca po1 = new Poupanca(p1, "789-7", 2000);
        Poupanca po2 = new Poupanca(p2, "456-9", 2000);

        Repositorio BD = new Repositorio();

        BD.inserir(po1);
        BD.inserir(po2);
        po1.debitar(80);
        po2.creditar(150);
        po1.renderjuros(0.01);
        po2.renderjuros(0.01);
        BD.relatorio();
    }
}
