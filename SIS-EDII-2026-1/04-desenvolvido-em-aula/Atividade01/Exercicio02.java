package atividade01;

public class Exercicio02 {

	public static void main(String[] args) {
		//Faça um programa que, dado o vetor {2; 4; 35; 50; 23; 17; 9; 12; 27; 5}, retorne:
		//		maior valor
		//		média dos valores
		int soma = 0;
		float media = 0;
		int[] vetor = new int[10];
		int aux = vetor[0];

		vetor[0] = 2;
		vetor[1] = 4;
		vetor[2] = 35;
		vetor[3] = 50;
		vetor[4] = 23;
		vetor[5] = 17;
		vetor[6] = 9;
		vetor[7] = 12;
		vetor[8] = 27;
		vetor[9] = 5;
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] > aux) {
				aux = vetor[i];
			}
			soma = soma + vetor[i];
		}
		media = (float) soma/vetor.length;
		System.out.println("A media é: " + media);
		System.out.println("O maior valor é: " + aux);
	}

}
