package org.example;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int antecessor = numero -1;
        int sucessor = numero +1;

        System.out.println("O número informado foi " + numero + " o antecessor é " + antecessor + " e o sucessor é " + sucessor);

        sc.close();
    }
}
