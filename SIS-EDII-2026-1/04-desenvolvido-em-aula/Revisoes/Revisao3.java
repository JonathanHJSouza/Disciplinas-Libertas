package atividade01;

import java.util.Scanner;

public class Revisao3 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada:");
        double valorHora = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        double horas = sc.nextDouble();

        double salarioBruto = calcularSalarioBruto(valorHora, horas);

        double bonus = calcularBonus(salarioBruto);

        double desconto = calcularDesconto(salarioBruto);

        double salarioFinal = calcularSalarioFinal(salarioBruto, bonus, desconto);

        mostrarSalario(salarioFinal);

        sc.close();
    }

    public static double calcularSalarioBruto(double valorHora, double horas) {
        return valorHora * horas;
    }

    public static double calcularBonus(double salarioBruto) {
        return salarioBruto * 0.10;
    }

    public static double calcularDesconto(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    public static double calcularSalarioFinal(double bruto, double bonus, double desconto) {
        return bruto + bonus - desconto;
    }

    public static void mostrarSalario(double salarioFinal) {
        System.out.println("Salário final: " + salarioFinal);
    }
}