public class Poupanca extends Conta {

    public Poupanca(Pessoa titular, String numero, double saldo){
        super(titular, numero, saldo);
    }
    public void debitar(double valor){
        if (valor<saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void creditar(double valor){
        saldo += valor;
    }
    public void renderjuros(double taxa){
        this.creditar(saldo * taxa);
    }
    public void relatorio(){
        titular.relatorio();
        System.out.println("--- Dados da Conta ---");
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
