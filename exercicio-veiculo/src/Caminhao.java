import java.util.Scanner;;

public class Caminhao extends Veiculo {
    private int carga;
    
    public Caminhao(){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o tamanho da carga: ");
        carga = input.nextInt();
    }
    public void mostrar(){
        System.out.println("Motor: " + motor);
        System.out.println("Número de rodas: " + n_rodas);
        System.out.println("Tamanho da carga: " + carga);
    }
}
