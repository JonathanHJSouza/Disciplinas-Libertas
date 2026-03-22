package atividade01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		//Escreva um algoritmo que receba as notas referentes a duas avaliações realizadas por 5 alunos
		//e as armazene numa matriz, juntamente com a média total obtida pelo aluno.
		
		Scanner s = new Scanner(System.in);

		float[][] matriz = new float[5][3]; 
		float soma;

		for(int i = 0; i < matriz.length; i++) {

		    soma = 0; 

		    for(int j = 0; j < 2; j++) {
		        System.out.println("Aluno " + (i+1) + " Nota " + (j+1));
		        matriz[i][j] = s.nextFloat();
		        soma += matriz[i][j];
		    }

		    matriz[i][2] = soma / 2; 
		}


		for(int i = 0; i < matriz.length; i++) {
		    System.out.println("Aluno " + (i+1) + " média: " + matriz[i][2]);
		}

		s.close();
	}
}