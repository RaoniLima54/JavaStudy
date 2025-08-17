
//10.Leia um valor de massa em quilogramas e apresente-o convertido em libras.
//A fórmula de conversão é: L = K / 0,45 , sendo K a massa em quilogramas e
//L a massa em libras.

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da massa em quilogramas: ");
            double k = input.nextDouble();

            double l = k / 0.45;

        System.out.println("O valor "+k+" kg convertido em libras é "+l+" L");
    }
}
