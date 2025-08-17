
//5. Leia um ângulo em radianos e apresente-o convertido em graus. A fórmula
//de conversão é: G = R ∗ 180/π, sendo G o ângulo em graus é R em radianos
//e π = 3.14.

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do ângulo em radianos: ");
            double R = scanner.nextDouble();

            double G = R * 180/Math.PI;

        System.out.println("O valor "+R+"° radianos convertida em graus é "+G+ "° graus");
    }
}
