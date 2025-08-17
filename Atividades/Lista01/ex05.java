
//5. Leia um número real e imprima a quinta parte deste número.

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
            double num = scanner.nextDouble();

            double quintaParte = num / 5;

        System.out.println("A quinta parte do número "+num+ " é " +quintaParte);
    }
}
