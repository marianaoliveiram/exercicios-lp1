public class PessoaJuridica extends Cliente {
    private String cnpj, nomeFantasia;

    public PessoaJuridica(String nome, String endereço, String telefone, String cnpj, String nomeFantasia){
        super(nome, endereço, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereço);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Nome Fantasia: " + nomeFantasia);
    }
}
