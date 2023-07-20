public abstract class Cliente {
    protected String nome, endereço, telefone;

    public Cliente(String nome, String endereço, String telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }
    public abstract void imprimirDados();
}
