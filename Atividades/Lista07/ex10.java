
//10.Faça um programa que mostre ao usuário um menu com 4 opções de
//operações matemáticas (as básicas, por exemplo). O usuário escolhe uma
//das opções e o seu programa então pede dois valores numéricos e realiza a
//operação, mostrando o resultado e saindo.

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha uma opção: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o primerio valor: ");
                int somaN1 =input.nextInt();
                System.out.println("Digite o segundo valor: ");
                int somaN2 =input.nextInt();

                int soma = somaN1 + somaN2;
                System.out.println("A soma dos valores "+ somaN1 +" e "+ somaN2 +" = "+ soma );
                break;

            case 2:
                System.out.println("Digite o primerio valor: ");
                int  subN1= input.nextInt();
                System.out.println("Digite o segundo valor: ");
                int subN2 =input.nextInt();

                int sub = subN1 - subN2;
                System.out.println("A subtração dos valores :" + subN1 +" e "+ subN2 +" = "+ sub );
                break;

            case 3:
                System.out.println("Digite o primerio valor: ");
                int multiN1= input.nextInt();
                System.out.println("Digite o segundo valor: ");
                int multiN2 =input.nextInt();

                int multi = multiN1*multiN2;
                System.out.println("A multiplicação dos valores " +multiN1+ " e " + multiN2 + " = " + multi );
                break;

            case 4:
                System.out.println("Digite o primerio valor: ");
                int divN1= input.nextInt();
                System.out.println("Digite o segundo valor: ");
                int divN2 =input.nextInt();

                int div = divN1/divN2;
                System.out.println("A divisão dos valores " + divN1 +" e "+ divN2 +" = "+ div );
                break;
        }
        input.close();
    }
}
