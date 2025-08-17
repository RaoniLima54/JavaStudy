
//1. Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida
//em km/h (quilômetros por hora). A fórmula de conversão é: K = M ∗ 3.6,
//sendo K a velocidade em km/h e M em m/s.

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Velocidade em m/s: ");
            double ms = scanner.nextDouble();

            double km = ms * 3.6;

        System.out.println("A velocidade " +ms+ "m/s convertida é " +km+ " k/m");

    }
}