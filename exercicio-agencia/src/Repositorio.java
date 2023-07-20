public class Repositorio {
    private int indice;
    private Agencia BD [];

    public Repositorio(){
        indice = 0;
        BD = new Agencia[5];
    }
    
    public void inserir(Agencia a){
        BD[indice] = a;
        indice++;
    }
    public void relatorio(){
        for (int i = 0; i < indice; i++){
            BD[i].relatorio();
            System.out.println("-----------");
        }
    }
}
