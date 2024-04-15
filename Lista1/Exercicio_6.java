package org.example;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        double nota2 = sc.nextDouble();

        double mediaPonderada = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        sc.close();
    }
}
