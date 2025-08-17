
//6. Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e
//imprima o dia da semana correspondente a este número. Isto é, domingo se
//1, segunda-feira se 2, e assim por diante.

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Segunda");
        System.out.println("2 - Terça");
        System.out.println("3 - Quarta");
        System.out.println("4 - Quinta");
        System.out.println("5 - Sexta");
        System.out.println("6 - Sabado");
        System.out.println("7 - Domingo");
        System.out.print("Escolha um dia da semana: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Segunda é foda mesmo! ");
                break;

            case 2:
                System.out.println("Terça-feira mesmo ?");
                break;

            case 3:
                System.out.println("Quarta-feira mesmo ?");
                break;

            case 4:
                System.out.println("Quinta-feira .... quase Sexta né kkkk ");
                break;

            case 5:
                System.out.println("Até que enfim , Sextouuuu !!!!");
                break;

            case 6:
                System.out.println("Sabadouuu!!!!");
                break;

            case 7:
                System.out.println("Porra , Domindo não !!!! ");
                break;

            default:
                System.out.println("Opção inválida !");
                break;
        }
        input.close();
    }
}
