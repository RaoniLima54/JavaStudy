
//7. Leia um valor de comprimento em centímetros e apresente-o convertido em
//polegadas. A fórmula de conversão é: P = C 2,54 , sendo C o comprimento
//em centímetros e P o comprimento em polegadas.

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o valor em Centimetros: ");
            double C = scanner.nextDouble();

            double P = C / 2.54;

        System.out.println("O valor "+C+" cm convertida em polegada é "+P );
    }
}
