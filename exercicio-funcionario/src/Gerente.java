public class Gerente extends Funcionario {

    private double aumento;

    public Gerente(String nome, double salario, int codigo){
        super(nome, salario, codigo);
    }
    
    public void aumentaSalario(){
       aumento = salario * 0.10;
       salario += aumento;
    }
    public void mostrar(){
        System.out.println("Nome do gerente: " + nome);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário: " + salario);
    }
}
