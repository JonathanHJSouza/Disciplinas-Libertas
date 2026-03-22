package atividade01;

import java.util.Scanner;


public class Revisao5 {

    public static double calcularDesconto(double preco) {
        return preco * 0.10;
    }

    public static double calcularImposto(double preco) {
        return preco * 0.08;
    }

    public static double calcularPrecoFinal(double preco) {

        double desconto = calcularDesconto(preco);
        double imposto = calcularImposto(preco);

        double precoFinal = preco - desconto + imposto;

        return precoFinal;
    }

    public static void mostrarPrecoFinal(double precoFinal) {
        System.out.println("Preço final do produto: " + precoFinal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do produto:");
        double preco = sc.nextDouble();

        double precoFinal = calcularPrecoFinal(preco);

        mostrarPrecoFinal(precoFinal);

        sc.close();
    }
}