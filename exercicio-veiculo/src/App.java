public class App {
    public static void main(String[] args) throws Exception {
        
        Caminhao scania = new Caminhao();
        Automovel corsa = new Automovel();
        Automovel celta = new Automovel();
        Caminhao iveco = new Caminhao();
        Automovel gol = new Automovel();

        Repositorio BD = new Repositorio();

        BD.inserir(scania);
        BD.inserir(corsa);
        BD.inserir(celta);
        BD.inserir(iveco);
        BD.inserir(gol);

        BD.remover(corsa);
        BD.remover(celta);
        BD.mostrar();
    }
}
