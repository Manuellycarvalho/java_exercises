import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldoPositivo = 0;
        int saldoNegativo = 0;
        int totalPessoas = 0;

        char continuar = 'S';

        while (continuar == 'S') {
            System.out.print("Informe o saldo da pessoa: ");
            double saldo = sc.nextDouble();
            totalPessoas++;

            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = sc.next().charAt(0);
        }

        double percentualPositivo = (saldoPositivo * 100.0) / totalPessoas;

        if (percentualPositivo >= 50) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }

        sc.close();
    }
}
