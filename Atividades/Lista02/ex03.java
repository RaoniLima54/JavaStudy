
//3. Leia uma distância em quilômetros e apresente-a convertida em milhas. A
//fórmula de conversão é: M = K 1,61 , sendo K a distância em quilômetros é
//M em milhas.

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância em Quilômetros: ");
            double km = scanner.nextDouble();

            double M = km / 1.609344;

        System.out.println("A distância " +km+ " km convertida em milhas é :" +M+ " milhas");
    }
}
