import java.util.Scanner;
public abstract class Veiculo {
    protected int motor;
    protected int n_rodas;

    public Veiculo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o motor: ");
        motor = input.nextInt();
        System.out.println("Digite o número de rodas: ");
        n_rodas = input.nextInt();
    }
    public abstract void mostrar();
}
