
//11. Leia um valor de massa em libras e apresente-o convertido em quilogramas.
//A fórmula de conversão é: K = L ∗ 0, 45, sendo K a massa em quilogramas e
//L a massa em libras.


import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da massa em Libras: ");
            double L = input.nextDouble();

            double K = L * 0.45;

        System.out.println("O valo "+L+" libras convertida em quilogramas é " +K+" kg");
    }
}
