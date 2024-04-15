import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor unitário do produto: ");
        double precoProduto = sc.nextDouble();
        System.out.println("Digite a quantidade que deseja comprar desse produto: ");
        int quantidadeProduto = sc.nextInt();

        double valorTotal;

        if (quantidadeProduto <= 12) {
            valorTotal = precoProduto * quantidadeProduto;
        } else {
            double precoComDesconto = precoProduto * 0.9; // Aplicando desconto de 10%
            valorTotal = precoComDesconto * quantidadeProduto;
        }

        System.out.printf("O valor da sua compra é: %.2f", valorTotal);
    }
}
