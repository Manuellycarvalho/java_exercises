import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeMaisAlto = "";
        double alturaMaisAlta = 0;

        String nomeMaisPesado = "";
        double pesoMaisPesado = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite o nome da pessoa " + i + ": ");
            String nome = sc.nextLine();

            System.out.println("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite o peso da pessoa " + i + " (em quilogramas): ");
            double peso = sc.nextDouble();
            sc.nextLine();

            if (altura > alturaMaisAlta) {
                nomeMaisAlto = nome;
                alturaMaisAlta = altura;
            }

            if (peso > pesoMaisPesado) {
                nomeMaisPesado = nome;
                pesoMaisPesado = peso;
            }
        }

        System.out.println("A pessoa mais alta é " + nomeMaisAlto + " com altura de " + alturaMaisAlta + " metros.");
        System.out.println("A pessoa mais pesada é " + nomeMaisPesado + " com peso de " + pesoMaisPesado + " quilogramas.");

        sc.close();
    }
}
