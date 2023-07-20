public abstract class Funcionario{
    protected String nome;
    protected double salario;
    protected int codigo;

    public Funcionario(String nome, double salario, int codigo){
        this.nome = nome;
        this.salario = salario;
        this.codigo = codigo;
    }
    public abstract void aumentaSalario();

    public abstract void mostrar();
}