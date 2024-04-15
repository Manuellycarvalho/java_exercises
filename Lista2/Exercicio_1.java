import java.util.Scanner;

public class Exercicio_1 {
    public static final String RESET = "\u001B[0m";

    public static final String GREEN = "\u001B[32m";

    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Menu----");
        System.out.println("[ " + GREEN + "1" + RESET + "]" - + GREEN + "Entrar" + RESET);
        System.out.println("[" + RED + "2" + RESET "]"  - + RED + "Sair" + RESET);
        System.out.println("Digite sua escolha: ");
        System.out.println("\nDigite aqui sua escolha: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite seu nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();

                if (idade >= 0 && idade <= 14) {
                    System.out.println("Você é uma criança!!");
                } else if (idade >= 15 && idade<= 17) {
                    System.out.println("Você é um Adolescente!!");
                } else if (idade >= 18 && idade <= 30) {
                System.out.println("Você é um Adulto Jovem!!");
                } else {
                    System.out.println("Você é Adultoo!!");
                }
                break;
            case 2:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }
    }
}
