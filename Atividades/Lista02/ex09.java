
//9. Leia um valor de volume em litros e apresente-o convertido em metros
//cúbicos m3. A fórmula de conversão é: M = L / 1000 , sendo L o volume em
//litros e M o volume em metros cúbicos.

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite o valor em litros : ");
            double L = scanner.nextDouble();

            double M = L/1000;

        System.out.println("O valor "+L+" L convertido em metros cúbicos é "+M+"m³");
    }
}
