import java.util.Scanner;

public class Exercicio_3 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número de gols que o Time A fez: ");
    int numGolsTimeA = sc.nextInt();
    System.out.println("Digite o número de gols que o time B fez: ");
    int numGolsTimeB = sc.nextInt();

    if (numGolsTimeA > numGolsTimeB){
        System.out.println("O time A Ganhouu!!!");
    } else if (numGolsTimeB > numGolsTimeA) {
        System.out.println("O time B Ganhouu!!!");
    }else {
        System.out.println("Deu empate");
    }
}
}

