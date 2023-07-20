public class Repositorio {
    private int indice;
    private Empregado BD [];

    public Repositorio(){
        indice = 0;
        BD = new Empregado [5];
    }
    public void inserir(Empregado e){
        BD[indice] = e;
        indice++;
    }
    public void remover(Empregado e){
        for(int i = 0; i < indice; i++){
            if(BD[i] == e){
                BD[i] = BD[indice - 1];
                BD[indice - 1] = null;
                indice--;
            }
        }
    }
    public void vencimento(){
        for(int i = 0; i < indice; i++){
            BD[i].vencimento();
            System.out.println("------");
        }
    }
}
