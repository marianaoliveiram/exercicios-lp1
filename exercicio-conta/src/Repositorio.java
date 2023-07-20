public class Repositorio {
    private int indice;
    private Conta BD [];

    public Repositorio(){
        indice = 0;
        BD = new Conta[5];
    }
    public void inserir(Conta c){
        BD[indice] = c;
        indice++;
    }
    public void relatorio(){
        for(int i = 0; i < indice; i++){
            BD[i].relatorio();
            System.out.println("------");
        }
    }
}
