
//7. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em
//graus Celsius. A fórmula de conversão é: C = 5.0 ∗ (F − 32.0)/9.0, sendo C a
//temperatura em Celsius e F a temperatura em Fahrenheit.


import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
            double F = scanner.nextDouble();

            double C = 5.0 * (F - 32) / 9;

        System.out.println("A temparatura " +F+ " Fahrenheit em Celsius é : " +C );
    }
}
