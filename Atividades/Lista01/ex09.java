//9. Leia uma temperatura em graus Celsius e apresente-a convertida em graus
//Kelvin. A fórmula de conversão é: K = C + 273.15, sendo C a temperatura em
//Celsius e K a temperatura em Kelvin.

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
            double C = scanner.nextDouble();

            double K = C + 273.15;

        System.out.println("A temperatua " +C+ " Celsius em Kelvin é " +K);

        scanner.close();
    }
}
