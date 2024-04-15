import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Menu---");
        System.out.println("[1] - Começar");
        System.out.println("[2] - cadastrar novo jogador");
        System.out.println("[3] - Sair");
        System.out.println("Digite aqui: ");

        int jogador = sc.nextInt();
        sc.nextLine();

        switch (jogador) {
            case 1:
                System.out.println("Começando ...");
                System.out.println("Olá!! Digite seu nome: ");
                String nome2 = sc.nextLine();

                if (verificarJogador(nome2)) {
                    System.out.println("Bem-Vind@ de volta " + nome2);
                } else {
                    System.out.println("Você é um novo jogador, " + nome2 + "!");
                    System.out.println("Digite sua idade: ");
                    int idade2 = sc.nextInt();
                    sc.nextLine();
                    cadastrarJogador(nome2, idade2);
                }
                break;
            case 2:
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                cadastrarJogador(nome, idade);
                break;
            case 3:
                System.out.println("Que pena...");
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("\nSorteado o número da sorte...");
        Random random = new Random();
        int numeroSorte = random.nextInt(100) + 1;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("Tempo esgotado! O número da sorte era: " + numeroSorte);
            }
        }, 10000);

        boolean acertou = false;
        for (int tentativas = 1; tentativas <= 3; tentativas++){
            System.out.println("Tentativas: " + tentativas + " de 3. Tente adivinhar o número da sorte: ");
            int palpite = sc.nextInt();

            if (palpite == numeroSorte){
                acertou = true;
                break;
            }else {
                System.out.println("Você errou! Tente novamente ");
            }
        }
        if (acertou){
            System.out.println("Parabéns! Você acertou o número da sorte!!");
        }else {
            System.out.println("Você esgotou suas tentativas! O número da sorte era: " + numeroSorte);
        }

        sc.close();
    }

    public static void cadastrarJogador(String nome, int idade) {
        try {
            FileWriter writer = new FileWriter("Jogadores.txt", true);
            writer.write("Nome: " + nome + ", Idade: " + idade + "\n");
            writer.close();
            System.out.println("Jogador cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao cadastrar jogador");
            e.printStackTrace();
        }
    }

    public static boolean verificarJogador(String nome) {
        File arquivo = new File("Jogadores.txt");
        try {
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                if (linha.contains("Nome: " + nome)) {
                    leitor.close();
                    return true;
                }
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao verificar jogador");
            e.printStackTrace();
        }
        return false;
    }
}
