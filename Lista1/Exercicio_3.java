package org.example;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de compra da mercadoria: ");
        double valorCompra = sc.nextDouble();

        double valorRepresentante = valorCompra * 0.20;

        double valorImposto = valorCompra * 0.30;

        double valorVenda = valorCompra + valorRepresentante + valorImposto;


        System.out.println("Valor da venda da mercadoria: R$" + valorVenda);
        System.out.println("Valor da comissaõ do representante: R$ " + valorRepresentante);
        System.out.println("Valor dos impostos: R$ " + valorImposto);

        sc.close();
    }
}
