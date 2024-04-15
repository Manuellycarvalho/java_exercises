import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o 3º número: ");
        int num3 = sc.nextInt();
        System.out.println("Digite o 4º número: ");
        int num4 = sc.nextInt();
        System.out.println("Digite o 5º número: ");
        int num5 = sc.nextInt();
        System.out.println("Digite o 6º número: ");
        int num6 = sc.nextInt();
        System.out.println("Digite o 7º número: ");
        int num7 = sc.nextInt();
        System.out.println("Digite o 8º número: ");
        int num8 = sc.nextInt();
        System.out.println("Digite o 9º número: ");
        int num9 = sc.nextInt();
        System.out.println("Digite o 10º número: ");
        int num10 = sc.nextInt();

        System.out.println("O que você deseja fazer com os números?");
        System.out.println("[A] - Somar");
        System.out.println("[B] - Encontrar o maior número");
        System.out.println("[C] - Encontrar o menor número");
        System.out.println("[D] - Calcular média");
        System.out.println("[E] - Sair do programa");
        System.out.println("Digite aqui sua escolha: ");

        char escolha = sc.next().charAt(0);

        switch (escolha) {
            case 'a':
                int soma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
                System.out.println("A soma dos números é: " + soma);
                break;
            case 'b':
                int maior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, Math.max(num5,
                        Math.max(num6, Math.max(num7, Math.max(num8, Math.max(num9, num10)))))))));
                System.out.println("O maior número é: " + maior);
                break;
            case 'c':
                int menor = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, Math.min(num5,
                        Math.min(num6, Math.min(num7, Math.min(num8, Math.min(num9, num10)))))))));
                System.out.println("O menor número é: " + menor);
                break;
            case 'd':
                double media = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10.0;
                System.out.println("A média dos números é: " + media);
                break;
            case 'e':
                System.out.println("Saindo do programa...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
