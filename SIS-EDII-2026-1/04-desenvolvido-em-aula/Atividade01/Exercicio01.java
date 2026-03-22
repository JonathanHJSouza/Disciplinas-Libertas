package atividade01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Escreva um programa em linguagem JAVA que lê as matrículas e as notas de no máximo 50 alunos. 
		//O programa deve ler e armazenar uma nova matrícula e uma nova nota até que o usuário digite uma matrícula negativa.
		
		int[] matLista = new int[50];
		float[] notasLista = new float[50];
		
		Scanner s = new Scanner(System.in);

		for(int i = 0; i < 50; i++) {
			System.out.println("Digite a matrícula: ");
			matLista[i] = s.nextInt();
			//vetor[i] = s.nextInt();
			if (matLista[i] < 0) {
				break;
			}
			
			System.out.println("Digite a nota: ");
			notasLista[i] = s.nextFloat();
			
		}
		
		System.out.println("Fim do programa");
		s.close();	
		
	}

}
