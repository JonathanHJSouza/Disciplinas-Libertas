package atividade01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		//Faça um programa que leia três valores inteiros por linha de uma matriz e outros três valores 
		//por coluna e depois faça uma rotina que some todos os valores informados.
		
		Scanner s = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int soma = 0; 
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = s.nextInt();
				soma = soma + matriz[i][j];
			}
		}
		
		System.out.println("A soma da matriz é: " + soma);
		
		s.close();
	}

}
