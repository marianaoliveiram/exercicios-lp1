public class Repositorio{
    private int indice;
    private Conta BD [];

    public Repositorio(){
        indice = 0;
        BD = new Conta [5];
    }
    public void inserir(Conta c){
        BD[indice] = c;
        indice++;
    }
    public void remover(Conta c){
        for(int i = 0; i < indice; i++){
            if(BD[i] == c){
                BD[i] = BD[indice-1];
                BD[indice-1] = null;
                indice--;
            }
        }
    }
    public void imprimir(){
        for(int i = 0; i < indice; i++){
            BD[i].imprimir();
        }
    }
}