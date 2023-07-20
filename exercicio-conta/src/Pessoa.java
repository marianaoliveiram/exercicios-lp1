public class Pessoa {
    private String nome, endereço, cidade, estado, rg;

    public Pessoa(String nome, String endereço, String cidade, String estado, String rg){
        this.nome = nome;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.rg = rg;
    }
    public void relatorio(){
        System.out.println("--- Dados do Titular ---");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereço);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("RG: " + rg);
    }
}
