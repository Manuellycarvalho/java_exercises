import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Menu----");
        System.out.println("[1] - Jogar");
        System.out.println("[2] - Cadastrar um jogador");
        System.out.println("[3] - Sair");
        System.out.println("Digite aqui: ");

        int escolhaMenu = sc.nextInt();
        sc.nextLine();

        switch (escolhaMenu) {
            case 1:
                System.out.println("Olá !! Digite seu nome: ");
                String nome = sc.nextLine();

                if (verificarJogadorPerguntas(nome)) {
                    System.out.println("Bem-Vind@ de volta " + nome);
                } else {
                    System.out.println("Você é um novo jogador, " + nome + "!");
                    System.out.println("Digite sua idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    cadastrarJogadorPerguntas(nome, idade);
                }
                break;
            case 2:
                System.out.println("Digite seu nome: ");
                String novoNome = sc.nextLine();
                System.out.println("Digite sua idade: ");
                int novaIdade = sc.nextInt();
                sc.nextLine();
                cadastrarJogadorPerguntas(novoNome, novaIdade);
                break;
            case 3:
                System.out.println("Saindo...");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        // Aqui, após a escolha do jogador, apresentamos as perguntas
        System.out.println("Escolha uma pergunta para responder: ");
        System.out.println("[1] - Qual é o principal conceito da programação orientada a objetos?");
        System.out.println("[2] - Qual é a função do operador 'new' em Java? ");
        System.out.println("Digite a sua escolha: ");

        int escolhaPergunta = sc.nextInt();
        sc.nextLine();

        switch (escolhaPergunta) {
            case 1:
                System.out.println("Qual é o principal conceito da programação orientada a objetos?");
                System.out.println("a) Encapsulamento");
                System.out.println("b) Herança");
                System.out.println("c) Polimorfismo");
                System.out.print("Digite a letra correspondente à sua resposta: ");
                String resposta1 = sc.nextLine().toLowerCase();
                if (resposta1.equals("a")) {
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners.");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima.");
                }
                break;
            case 2:
                System.out.println("Qual é a função do operador 'new' em Java?");
                System.out.println("a) Criar uma nova instância de uma classe");
                System.out.println("b) Realizar uma operação de multiplicação");
                System.out.println("c) Definir um novo método");
                System.out.print("Digite a letra correspondente à sua resposta: ");
                String resposta2 = sc.nextLine().toLowerCase();
                if (resposta2.equals("a")) {
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners.");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }

    public static void cadastrarJogadorPerguntas(String nome, int idade) {
        try {
            FileWriter writer = new FileWriter("JogadoresPerguntas.txt", true);
            writer.write("Nome: " + nome + ", Idade: " + idade + "\n");
            writer.close();
            System.out.println("Jogador cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao cadastrar jogador");
            e.printStackTrace();
        }
    }

    public static boolean verificarJogadorPerguntas(String nome) {
        File arquivo = new File("JogadoresPerguntas.txt");
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
