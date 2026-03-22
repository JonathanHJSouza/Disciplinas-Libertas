package atividade01;

import java.util.Scanner;


public class Revisao6 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int quantidadeProdutos = 4;
	        int quantidadeDias = 3;

	        String[] produtos = new String[quantidadeProdutos];
	        int[][] vendas = new int[quantidadeProdutos][quantidadeDias];
	        int[] totalProduto = new int[quantidadeProdutos];

	        // leitura dos produtos
	        for (int i = 0; i < quantidadeProdutos; i++) {

	            System.out.println("Digite o nome do produto:");
	            produtos[i] = sc.nextLine();

	            for (int j = 0; j < quantidadeDias; j++) {

	                System.out.println("Digite a quantidade vendida no dia " + (j + 1) + " para " + produtos[i] + ":");
	                vendas[i][j] = sc.nextInt();

	            }

	            sc.nextLine();
	        }

	        int totalGeral = 0;
	        int maiorVenda = 0;
	        int indiceMaisVendido = 0;

	        System.out.println("\nRESUMO DAS VENDAS");

	        for (int i = 0; i < quantidadeProdutos; i++) {

	            int soma = 0;

	            for (int j = 0; j < quantidadeDias; j++) {

	                soma += vendas[i][j];

	            }

	            totalProduto[i] = soma;

	            System.out.println("Produto: " + produtos[i]);
	            System.out.println("Total vendido: " + totalProduto[i]);
	            System.out.println();

	            totalGeral += soma;

	            if (soma > maiorVenda) {
	                maiorVenda = soma;
	                indiceMaisVendido = i;
	            }
	        }

	        System.out.println("Produto mais vendido: " + produtos[indiceMaisVendido]);
	        System.out.println("Total geral de vendas: " + totalGeral);

	        sc.close();
	    }
	}