public class App {
    public static void main(String[] args) throws Exception {
        
        Gerente g1 = new Gerente("Mariana", 5000, 123);
        Programador p1 = new Programador("Renata", 6000, 456);

        Repositorio BD = new Repositorio();

        BD.inserir(g1);
        BD.inserir(p1);
        g1.aumentaSalario();
        p1.aumentaSalario();
        BD.mostrar();
    }
}
