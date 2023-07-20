public class App {
    public static void main(String[] args) throws Exception {
        
        PessoaFisica pf1 = new PessoaFisica("Renata Leal", "Caminho Dezesseis, 34 - Zabelê", "(77) 98876-6632", "000.327.625-26");
        PessoaJuridica pj1 = new PessoaJuridica("Jorge Moraes", "Avenida Brumado, 918 - Ibirapuera", "(77) 98832-4368", "789.123.412/0001-56", "BigBurg's");

        Repositorio BD = new Repositorio();

        BD.inserir(pf1);
        BD.inserir(pj1);
        BD.remover(pf1);
        BD.inserir(pf1);
        BD.imprimirDados();
    }
}
