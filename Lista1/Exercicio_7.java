package org.example;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = sc.nextLine();

        System.out.println("Digite p mês: ");
        String mes = sc.nextLine();

        System.out.println("Digite o número de carros vendidos: ");
        int numCarrosVendidos = sc.nextInt();

        System.out.println("Digite o valor total das vendas: ");
        double valorTotalVendas = sc.nextDouble();

        double salarioFixo = 1500.00;
        double comissaoPorCarro = 350.00;
        double comissaoTotal = comissaoPorCarro * numCarrosVendidos;
        double comissaoPorVendas = 0.001 * valorTotalVendas;

        double salarioTotal = salarioFixo + comissaoTotal + comissaoPorVendas;

        System.out.println("\n --- Salário do Vendedor ---");
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Mês: " + mes);
        System.out.println("Número de carros vendidos: " + numCarrosVendidos);
        System.out.println("Valor total das vendas: R$ " + valorTotalVendas);
        System.out.println("Salário Fixo: R$ 1500.00");
        System.out.println("Comissão por carro vendido: R$" + comissaoPorCarro);
        System.out.println("Comissão por vendas: R$" + comissaoPorVendas);
        System.out.println("Salário Total: R$" + salarioTotal);

        sc.close();
    }
}
