
//6. Leia um valor de comprimento em polegadas e apresente-o convertido em
//centímetros. A fórmula de conversão é: C = P ∗ 2, 54, sendo C o
//comprimento em centımetros e P o comprimento em polegadas.

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o comprimento em polegadas : ");
            double P =scanner.nextDouble();

            double C = P * 2.54;

        System.out.println("O valor "+P+" polegadas convertida em centímetros"+C+" cm");
    }
}
