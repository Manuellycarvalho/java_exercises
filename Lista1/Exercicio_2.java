package org.example;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1ª número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o 2ª número: ");
        int num2 = sc.nextInt();

        System.out.println("A soma desses números é: " + (num1 + num2));
        System.out.println("A subtração desses números é: " + (num1 - num2));
        System.out.println("A Multiplicação desses números é: " + (num1 * num2));

        if (num2 != 0){
            System.out.println("A Divisão desses números é: " + ((double) num1 / num2));
            System.out.println("A Elevação desses números é: " + Math.pow(num1,num2));
            System.out.println("O Resto desses números é: " + ( num1 % num2));
        }else {
            System.out.println("É impossível fazer a divisão com 0");
        }

    }




}
