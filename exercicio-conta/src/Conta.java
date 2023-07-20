public abstract class Conta{
    protected Pessoa titular;
    protected String numero;
    protected double saldo;

    public Conta(Pessoa titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    public abstract void debitar(double valor);
    public abstract void creditar(double valor);
    public abstract void renderjuros(double taxa);
    public abstract void relatorio();
}