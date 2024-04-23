import java.util.Scanner;

public class interacaoMenu {

    private double valor = 0;
    Scanner scanner = new Scanner(System.in);

    private ConversorDeMoeda conversor = new ConversorDeMoeda();

    public String realizarConversao(String mb, String mc, String mbe, String mce){

        System.out.println("Qual valor em "+ mbe + " deseja converter para " + mce +"?");
        valor = scanner.nextDouble();
        return "\n" + conversor.conversao(valor,mb,mc,mbe,mce) + "\n";

    }
}
