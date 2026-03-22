package atividade01;
import java.util.Scanner;
public class Revisao2 {

    public static double calcularArea(double largura, double comprimento) {

        double area = largura * comprimento;
        return area;
    }

    public static void mostrarArea(double area) {

        System.out.println("A área do terreno é: " + area);
    }
    
    
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno:");
        double largura = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno:");
        double comprimento = sc.nextDouble();

        double area = calcularArea(largura, comprimento);

        mostrarArea(area);

        sc.close();
    }
    
    
}