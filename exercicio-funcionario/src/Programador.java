public class Programador extends Funcionario {

    private double TAXA = 0.20;
    private double aumento;

    public Programador(String nome, double salario, int codigo){
        super(nome, salario, codigo);
    }
    public void aumentaSalario(){
        aumento = salario * TAXA;
        salario += aumento;
    }
    public void mostrar(){
        System.out.println("Nome do programador: " + nome);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário: " + salario);
    }
    
}
