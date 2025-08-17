
//8. Leia um valor de volume em metros cúbicos m3 e apresente-o convertido em
//litros. A fórmula de conversão é: L = 1000 ∗ M, sendo L o volume em litros e
//M o volume em metros cúbicos.

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o valor em metros cúbicos m³ : ");
            double C = scanner.nextDouble();

            double L = 1000 * C;

        System.out.println("O valor "+C+" m³ convertido em litros é "+L+" L");
    }
}
