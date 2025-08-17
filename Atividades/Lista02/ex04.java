
//4. Leia um ângulo em graus e apresente-o convertido em radianos. A fórmula
//de conversão é: R = G ∗ π/180, sendo G o ângulo em graus é R em radianos
//e π = 3.14.

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ângulo em graus : ");
            double G = scanner.nextDouble();

            double pi = 3.14159;

            double R = G * pi/180;

        System.out.println("O valor " +G+ "° graus convertido para radianos é " +R+ " radianos");

        scanner.close();
    }
}
