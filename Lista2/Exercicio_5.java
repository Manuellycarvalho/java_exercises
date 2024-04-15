import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quatidade atual em estoque: ");
        int quantidadeAtual = sc.nextInt();
        System.out.println("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = sc.nextInt();

        System.out.println("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = sc.nextInt();

        double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2.0;

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        }else {
            System.out.println("Efetuar compra");
        }
    }
}
