import java.util.Scanner;
public class Premium extends Agencia {
    private int codigo;

    public Premium(int idade_abertura, String cnpj, String nome_gerente, int codigo){
        super(idade_abertura, cnpj, nome_gerente);
        this.codigo = codigo;
        
    }
    public void relatorio(){
        System.out.println("Idade: " + idade_abertura);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Nome do gerente: " + nome_gerente);
        System.out.println("Código: " + codigo);
    }
}
