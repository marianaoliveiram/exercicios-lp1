public class Repositorio {
    private int indice;
    private Funcionario BD [];

    public Repositorio(){
        indice = 0;
        BD = new Funcionario [5];
    }
    public void inserir(Funcionario f){
        BD[indice] = f;
        indice ++;
    }
    public void mostrar(){
        for(int i = 0; i < indice; i++){
            BD[i].mostrar();
            System.out.println("----------");
        }
    }
    
}
