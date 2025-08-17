
//1. Faça um programa que leia um número inteiro e o imprima.
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        System.out.println("Você digitou: " + numero);
    }
}