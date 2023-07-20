public class Comum extends Agencia {

    public Comum(int idade_abertura, String cnpj, String nome_gerente){
        super(idade_abertura, cnpj, nome_gerente);
    }
    public void relatorio(){
        System.out.println("Idade: " + idade_abertura);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Nome do gerente: " + nome_gerente);
    }
}
