
//1. Escreva um programa que leia um número inteiro maior do que zero e
//devolva, na tela, a soma de todos os seus algarismos. Por exemplo, ao
//número 251 corresponderá o valor 8 (2 + 5 + 1). Se o número lido não for
//maior do que zero, o programa terminará com a mensagem “Número
//inválido”.

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;

        while(true){
            System.out.println("Digite um número de três: ");
            n1 = input.nextInt();

            if(n1==0){
                System.out.println("Número Inválido");
                break;
            }

            if (n1<100 || n1>999) {
                System.out.println("Número invalido! Tente novamente! ");
                continue;
            }

            int centena = n1 / 100;
            int dezena =  (n1 /10) % 10;
            int unidade = n1 % 10;


            int soma = centena + dezena + unidade;


            System.out.println("Centena : " + centena);
            System.out.println("Dezena : " + dezena);
            System.out.println("Unidade : " + unidade);
            System.out.println("Soma do algarismo: " + soma);
            break;
        }

        input.close();

    }
}
