public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String endereço, String telefone, String cpf){
        super(nome, endereço, telefone);
        this.cpf = cpf;
    }
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereço);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
    }
}
