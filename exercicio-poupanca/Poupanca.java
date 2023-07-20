public class Poupanca extends Conta{
    private DataAniversario dataA;

    Poupanca(String numero, double saldo, Cliente titular, DataAniversario dataA){
        super(numero, saldo, titular);
        this.dataA = dataA;
    }

    public void renderjuros(double taxa){
        this.creditar(saldo*taxa);
    }
    
    public void imprimir(){
        System.out.println("-----------");
        System.out.println("Número da Poupança: " + numero);
        System.out.println("Saldo da Poupança: " + saldo);
        titular.imprimir();
        dataA.imprimir();
    }
}