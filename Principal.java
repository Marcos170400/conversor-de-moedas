import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        try {
            while (escolha != 7) {
                ConversorDeMoeda conversor = new ConversorDeMoeda();
                interacaoMenu interacao = new interacaoMenu();
                interfaceMenu exibicao = new interfaceMenu();
                exibicao.exibeInterface();

                escolha = scanner.nextInt();

                double valor = 0;

                if (escolha == 1) {
                    System.out.println(interacao.realizarConversao("USD", "ARS","dólar","peso argentino"));
                } else if (escolha == 2) {
                    System.out.println(interacao.realizarConversao("ARS", "USD", "peso argentino", "dólar"));
                } else if (escolha == 3) {
                    System.out.println(interacao.realizarConversao("USD", "BRL", "dólar","real brasileiro"));
                } else if (escolha == 4) {
                    System.out.println(interacao.realizarConversao("BRL", "USD", "real brasileiro", "dólar"));
                } else if (escolha == 5) {
                    System.out.println(interacao.realizarConversao("USD", "COP", "dólar", "peso colombiano"));
                } else if (escolha == 6) {
                    System.out.println("Conversão de peso colombiano para dólar");
                    System.out.println(interacao.realizarConversao("COP", "USD", "peso colombiano", "dólar"));
                } else if (escolha == 7) {
                    System.out.println("Saindo da aplicação... Volte sempre!");
                }

            }
        } catch (RuntimeException e){
            System.out.println("Escolha inválida...");
            System.out.println("Finalizando a aplicação...");
        }

    }
}
