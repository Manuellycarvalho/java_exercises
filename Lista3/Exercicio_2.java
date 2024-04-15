import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acimaDe50 = 0;
        int acimaDe160 = 0;
        int abaixoDe80 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe os dados da pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = sc.nextDouble();
            System.out.print("Peso (em kg): ");
            double peso = sc.nextDouble();

            if (idade > 50) {
                acimaDe50++;
            }

            if (altura > 1.60) {
                acimaDe160++;
            }

            if (peso < 80) {
                abaixoDe80++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("a. Quantidade de pessoas com idade acima de 50 anos: " + acimaDe50);
        System.out.println("b. Quantidade de pessoas com altura acima de 1.60m: " + acimaDe160);
        System.out.println("c. Quantidade de pessoas com peso abaixo de 80kg: " + abaixoDe80);

        sc.close();
    }
}
