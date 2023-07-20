public class Repositorio {
    private int indice;
    private Cliente BD [];

    public Repositorio(){
        indice = 0;
        BD = new Cliente [5];
    }
    public void inserir(Cliente c){
        BD[indice] = c;
        indice++;
    }
    public void remover(Cliente c){
        for(int i = 0; i < indice; i++){
            if(BD[i] == c){
                BD[i] = BD[indice - 1];
                BD[indice-1] = null;
                indice--;
            }
        }
    }
    public void imprimirDados(){
        for(int i = 0; i < indice; i++){
            BD[i].imprimirDados();
            System.out.println("------");
        }
    }
}