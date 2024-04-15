package org.example;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Exercicio_1 {
    public static final String RESET = "\u001B[0m";

    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("Escolha uma opção: ");
        System.out.println("[" + GREEN +  "1" + RESET + "]" + GREEN + "Entrar" + RESET );
        System.out.println("[" + RED + "2" + RESET + "]" + RED + "Sair" + RESET);
        System.out.println("\nDigite aqui sua escolha: ");


        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha){
            case 1:
                System.out.println("Iniciando...");

                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("  ");

                        System.out.println("Digite seu nome: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite seu sobrenome: ");
                        String sobrenome = sc.nextLine();

                        System.out.println("Digite sua data de nascimento (DD/MM/AAAA): ");
                        String dataNascimento = sc.nextLine();

                        System.out.println("Pretensão Salárial: ");
                        double pretensaoSalario = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite seu grau de instrução (ensino médio, ensino técnico ou ensino superior): ");
                        String grauinstrucao = sc.nextLine();

                        System.out.println("Digite seu Cargo Pretendido: ");
                        String cargoPretendido = sc.nextLine();

                        System.out.println("Você possui CNH do tipo B? (Sim ou Não): ");
                        String temcarta = sc.nextLine();

                        System.out.println("\nCadastro realizado com sucesso! Verifique os dados foram preenchidos corretamente: ");
                        System.out.println("Nome: " + nome);
                        System.out.println("Sobrenome: " + sobrenome);
                        System.out.println("Data de Nascimento: " + dataNascimento);
                        System.out.println("Pretensão Salárial: " + pretensaoSalario);
                        System.out.println("Grau de Instrução: " + grauinstrucao);
                        System.out.println("Cargo Pretendido: " + cargoPretendido);
                        System.out.println("Possui CNH: " + temcarta);
                    }
                }, 2000);
                break;
            case 2:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida");
                sc.close();
        }

    }
}