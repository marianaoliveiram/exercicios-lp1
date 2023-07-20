public class Assalariado extends Empregado {
    private double salario;

    public Assalariado(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }
    public void vencimento(){
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("--- CONTRA CHEQUE ---");
        System.out.println("Contra-cheque: R$" + salario);
    }
}