import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = sc.nextInt();

        System.out.print("Saída do programa: ");
        for (int i = 0; i <= numero; i += incremento) {
            System.out.print(i);
            if (i != numero) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
