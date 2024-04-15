import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int otimo = 0;
        int bom = 0;
        int ruim = 0;
        int total = 0;
        double somaNotas = 0.0;

        char continuar;

        do {
            System.out.println("Opções de opinião sobre o filme:");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Digite sua opinião: ");
            int opiniao = sc.nextInt();

            switch (opiniao) {
                case 1:
                    otimo++;
                    break;
                case 2:
                    bom++;
                    break;
                case 3:
                    ruim++;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            total++;
            somaNotas += opiniao;

            System.out.print("Deseja continuar? (S/N): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("\nResultados:");
        System.out.println("a. Quantidade de pessoas que responderam ótimo: " + otimo);
        System.out.println("   Isso representa " + ((double) otimo / total * 100) + "% de todos os respondentes.");
        System.out.println("b. Quantidade de pessoas que responderam bom: " + bom);
        System.out.println("   Isso representa " + ((double) bom / total * 100) + "% de todos os respondentes.");
        System.out.println("c. Quantidade de pessoas que responderam ruim: " + ruim);
        System.out.println("   Isso representa " + ((double) ruim / total * 100) + "% de todos os respondentes.");
        System.out.println("d. Total de pessoas que responderam: " + total);
        System.out.println("   Média de notas do filme: " + (somaNotas / total));

        sc.close();
    }
}
