package org.example;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas: ");
        int hora = sc.nextInt();

        System.out.println("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        System.out.println("Digite a quantidade de segundos: ");
        int segundos = sc.nextInt();

        int totalSegundos = hora * 3600 + minutos * 60 + segundos;

        System.out.println("O horário informado é equivalente a " + totalSegundos + " Segundos");

        sc.close();
    }
}
