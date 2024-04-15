import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double valorBase = 3000.0;
        final double percentualComAlmoco = 1.0;
        final double percentualSemAlmocoMaceio = 0.85;
        final double percentualSemAlmocoPortoGalinha = 0.45;

        System.out.println("Onde você deseja passar as férias (Maceió ou Porto de Galinhas): ");
        System.out.println("[1] - Maceió");
        System.out.println("[2] - porto de Galinhas");
        System.out.println("Digite aqui: ");
        int destino = sc.nextInt();

        System.out.println("Você deseja o valor do almoço/janta incluso?: ");
        System.out.println("[1] - Sim");
        System.out.println("[2] - Não");
        int inclusoAlmocoJantar = sc.nextInt();

        double valorFinal = valorBase;

        switch (destino) {
            case 1:
                if (inclusoAlmocoJantar == 1) {
                    valorFinal *= (1 + percentualComAlmoco);
                } else {
                    valorFinal *= percentualSemAlmocoMaceio;
                }
                break;
            case 2:
                if (inclusoAlmocoJantar == 1) {
                    valorFinal *= (1 + 0.6);
                } else {
                    valorFinal *= percentualSemAlmocoPortoGalinha;
                }
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        System.out.printf("O valor final da viagem é: R$ %.2f", valorFinal);
    }
}
