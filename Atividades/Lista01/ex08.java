//8. Leia uma temperatura em graus Kelvin e apresente-a convertida em graus
//Celsius. A fórmula de conversão é: C = K − 273.15, sendo C a temperatura
//em Celsius e K a temperatura em Kelvin.

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Kelvin: ");
            double K = scanner.nextDouble();

            double C = K - 273.15;

        System.out.println("a temperatura " +K+ " Kelvin em Celsius é " +C);
    }
}
