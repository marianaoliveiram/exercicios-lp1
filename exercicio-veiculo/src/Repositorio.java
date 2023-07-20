public class Repositorio {
    private int indice;
    private Veiculo[] BD;

    public Repositorio(){
        BD = new Veiculo [5];
        indice = 0;
    }
    public void inserir(Veiculo v){
        BD[indice] = v;
        indice++;
    }
    public void remover(Veiculo v){
        for(int i = 0; i < indice; i++){
            if(BD[i] == v){
                BD[i] = BD[indice - 1];
                BD[indice - 1] = null;
                indice = indice - 1;
            }
        }
    }
    public void mostrar(){
        for(int i = 0; i < indice; i++){
            BD[i].mostrar();
        }
    }

}
