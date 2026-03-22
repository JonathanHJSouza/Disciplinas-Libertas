package atividade01;

import java.util.Scanner;


public class Revisao4 {

    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double converterParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void mostrarResultados(double celsius, double fahrenheit, double kelvin) {
        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double celsius = sc.nextDouble();

        double fahrenheit = converterParaFahrenheit(celsius);

        double kelvin = converterParaKelvin(celsius);

        mostrarResultados(celsius, fahrenheit, kelvin);

        sc.close();
    }
}