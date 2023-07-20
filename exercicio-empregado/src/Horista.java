public class Horista extends Empregado {
    private double precoHora, horasTrabalhadas;

    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas){
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void vencimento(){
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("--- CONTRA CHEQUE ---");
        System.out.println("Preço da hora: " + precoHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Contra-cheque: R$" + precoHora * horasTrabalhadas);
    }
}
