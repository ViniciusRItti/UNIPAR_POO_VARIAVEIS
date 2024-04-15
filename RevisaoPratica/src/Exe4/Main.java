package Exe4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a cor do círculo:");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);

        System.out.println("\nCaracterísticas do Círculo:");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Cor: " + circulo.getCor());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
