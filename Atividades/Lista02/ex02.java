
//2. Leia uma distância em milhas e apresente-a convertida em quilômetros. A
//fórmula de conversão é: K = 1, 61 ∗ M, sendo K a distância em quilômetros é
//M em milhas.


import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia em milhas: ");
            double M = scanner.nextDouble();

            double k = 1.61 * M;

        System.out.println("A distância " +M+ "milhas convertida em quilômetros é " +k+ "km");
    }
}
