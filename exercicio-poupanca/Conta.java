public class Conta{
    protected String numero;
    protected double saldo;
    protected Cliente titular;

    public Conta(String numero, double saldo, Cliente titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        if(saldo>=valor){
            saldo -=valor;
        } else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void imprimir(){
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo da conta: " + saldo);
        titular.imprimir();
    }
}