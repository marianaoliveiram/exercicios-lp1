public class Comissionado extends Empregado{
    private double totalVenda, taxaComissao;

    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao){
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }
    public void vencimento(){
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("--- CONTRA CHEQUE ---");
        System.out.println("Total de vendas: " + totalVenda);
        System.out.println("Taxa da comissão: " + taxaComissao);
        System.out.println("Contra-cheque: R$" + totalVenda * taxaComissao);
    }
}
