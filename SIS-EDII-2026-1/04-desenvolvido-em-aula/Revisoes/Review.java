package atividade01;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeAlunos = 3;
        int quantidadeNotas = 2;

        // Vetor para armazenar nomes
        String[] nomes = new String[quantidadeAlunos];

        // Matriz para armazenar notas
        double[][] notas = new double[quantidadeAlunos][quantidadeNotas];

        // Vetor para armazenar médias
        double[] medias = new double[quantidadeAlunos];

        // ===============================
        // LEITURA DOS DADOS
        // ===============================

        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.println("Digite o nome do aluno:");
            nomes[i] = scan.nextLine();

            for (int j = 0; j < quantidadeNotas; j++) {
                System.out.println("Digite a nota " + (j + 1) + " de " + nomes[i] + ":");
                notas[i][j] = scan.nextDouble();
            }

            scan.nextLine(); // Limpa o buffer do teclado
        }

        System.out.println("\n===== RESULTADOS =====");

        // ===============================
        // PROCESSAMENTO
        // ===============================

        for (int i = 0; i < quantidadeAlunos; i++) {

            // Chamando função com retorno
            medias[i] = calcularMedia(notas[i][0], notas[i][1]);

            System.out.println("Média de " + nomes[i] + ": " + medias[i]);

            // Chamando função sem retorno
            verificarAprovacao(nomes[i], medias[i]);
        }

        // ===============================
        // MÉDIA DA TURMA
        // ===============================

        double mediaTurma = calcularMediaTurma(medias[0], medias[1], medias[2]);

        System.out.println("\nMédia da turma: " + mediaTurma);

        scan.close();
    }

    // ==========================================
    // FUNÇÃO COM RETORNO (calcula média individual)
    // ==========================================
    public static double calcularMedia(double nota1, double nota2) {

        double media = (nota1 + nota2) / 2;
        return media;
    }

    // ==========================================
    // FUNÇÃO SEM RETORNO (verifica aprovação)
    // ==========================================
    public static void verificarAprovacao(String nome, double media) {

        if (media >= 6) {
            System.out.println(nome + " está APROVADO");
        } else {
            System.out.println(nome + " está REPROVADO");
        }
    }

    // ==========================================
    // FUNÇÃO COM RETORNO (média da turma)
    // ==========================================
    public static double calcularMediaTurma(double m1, double m2, double m3) {

        return (m1 + m2 + m3) / 3;
		
		
	}

}








