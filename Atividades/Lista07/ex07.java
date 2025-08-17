
//7. Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e
//imprima o mês correspondente a este número. Isto é, janeiro se 1, fevereiro
//se 2, e assim por diante.

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Janeiro");
        System.out.println("2 - Fevereiro");
        System.out.println("3 - Marco");
        System.out.println("4 - Abril");
        System.out.println("5 - Maio");
        System.out.println("6 - Junho");
        System.out.println("7 - Julho");
        System.out.println("8 - Agosto");
        System.out.println("9 - Setembro");
        System.out.println("10 - Outubro");
        System.out.println("11 - Novembro");
        System.out.println("12 - Dezembro");
        System.out.println("Escolha um opção: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Janeiro tempos de fazer metas !");
                break;
            case 2:
                System.out.println("Fevereiro fazer o shape pro Carnaval !");
                break;

            case 3:
                System.out.println("Marco começou a complicar kkkk!");
                break;

            case 4:
                System.out.println("Abril , foda-se as metas do ano!");
                break;

            case 5:
                System.out.println("Maio , tristeza !");
                break;

            case 6:
                System.out.println("Junho , Uiiii São Joâo Fogueira!!!");
                break;

            case 7:
                System.out.println("Julho pagar as dividas do São João !");
                break;

            case 8:
                System.out.println("Agosto volta pra academia !");
                break;

            case 9:
                System.out.println("Setembro foco absoluto, NO FAP !");
                break;

            case 10:
                System.out.println("Outubro corre pelo tempo perdido no NO FAP KKKKK ");
                break;

            case 11:
                System.out.println("Novembro ja to cansado ");
                break;

            case 12:
                System.out.println(" Dezembro final do ano e natal !");
                break;

            default:
                System.out.println("Opção invalida!");
                break;
        }
        input.close();
    }
}
