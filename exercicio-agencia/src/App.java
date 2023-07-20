public class App {
    public static void main(String[] args) throws Exception {
        Comum c1 = new Comum(19, "888888888", "Mariana");
        Premium p1 = new Premium(44, "55555555555","Renata",78945);

        Repositorio BD = new Repositorio();

        BD.inserir(c1);
        BD.inserir(p1);
        BD.relatorio();
    }
}
