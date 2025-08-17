
//10.Leia uma velocidade em km/h (quilômetros por hora) e apresente-a
//convertida em m/s (metros por segundo). A fórmula de conversão é: M =
//K/3.6, sendo K a velocidade em km/h e M em m/s.

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Velociade em Km/h");
            float Km = scanner.nextFloat();

            float Ms = (float) (Km / 3.6);

        System.out.println("A velocidade " +Km+ " km/h convertida é " +Ms+ " m/s");
    }
}
