
//6. Leia uma temperatura em graus Celsius e apresente-a convertida em graus
//Fahrenheit. A fórmula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a
//temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em graus Celsius: ");
            double C = scanner.nextDouble();

            double F = (9.0/5.0 * C) + 32;

        System.out.println("O valor " +C+" celsius convertido em Fahrenheit é " +F );
    }
}
