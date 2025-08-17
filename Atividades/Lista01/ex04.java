//4. Leia um número real e imprima o resultado do quadrado desse número.

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
            int num = scanner.nextInt();

            int Qua = num * num;


        System.out.println("O quadrado do numero " +num+ " é "+Qua);

    }
}
