import java.util.Scanner;

public class Automovel extends Veiculo {
    private String tipo;

    public Automovel(){
        super();
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o tipo de automóvel: ");
        tipo = input.nextLine();
    }
    public void mostrar(){
        System.out.println("Motor: " + motor);
        System.out.println("Número de rodas: " + n_rodas);
        System.out.println("Tipo do automóvel: " + tipo);
    }
    
}
