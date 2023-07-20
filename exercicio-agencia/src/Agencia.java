import java.util.Scanner;
public abstract class Agencia {
    protected int idade_abertura;
    protected String cnpj;
    protected String nome_gerente;

    public Agencia(int idade_abertura, String cnpj, String nome_gerente){
        this.idade_abertura = idade_abertura;
        this.cnpj = cnpj;
        this.nome_gerente = nome_gerente;
    }
    public abstract void relatorio();
}
