//11. Faça um programa para verificar se um determinado número inteiro é
//divisível por 3 ou 5, mas não simultaneamente pelos dois.

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = input.nextInt();

        if ((n%3==0)&&(n%5==0)){
            System.out.println("O número "+n+" é divisível por 3 e por 5.");
        } else if (n%3==0) {
            System.out.println("O número "+n+" é divisível apenas por 3");
        }else if (n%5==0) {
            System.out.println("O número "+n+" é divisível apenas por 5");
        }else {
            System.out.println("O número "+n+" NÃO atende à condição.");
        }
        input.close();
    }
}
