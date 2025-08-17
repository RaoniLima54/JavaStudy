
//13.Leia um valor de comprimento em metros e apresente-o convertido em
//jardas. A fórmula de conversão é: J = M / 0,91 , sendo J o comprimento em
//jardas e M o comprimento em metros.


import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do comprimento em metros: ");
            double M = input.nextDouble();

            double J = M / 0.91;

        System.out.println("O comprimento "+M+" metros convertida em Jardas é "+J+" Jardas");
    }
}
