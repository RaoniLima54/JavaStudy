

//2. Faça um programa que leia um número real e o imprima.

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero real :");
        double numero = scanner.nextDouble();

        System.out.println("O numero é : " + numero);

        scanner.close();

    }
}
