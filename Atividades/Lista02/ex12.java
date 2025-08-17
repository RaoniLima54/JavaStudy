
//12.Leia um valor de comprimento em jardas e apresente-o convertido em
//metros. A fórmula de conversão é: M = 0, 91 ∗ J, sendo J o comprimento em
//jardas e M o comprimento em metros.

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento em Jardas: ");
            double J = sc.nextDouble();

            double M = 0.91 * J ;

        System.out.println("O comprimento "+J+" Jardas convertida em mestros é "+M+" m");

    }
}
