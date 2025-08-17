
//8. Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
//
//A = (basemaior + basemenor) ∗ altura /2
//Lembre-se a base maior e a base menor devem ser números maiores que
//zero.

import java.util.Scanner;

public class ex08e09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseMaior , baseMenor, altura, area;

        System.out.println("Digite a base maior: ");
        baseMaior = input.nextDouble();
        if (baseMaior <= 0) {
            System.out.println("Valor inválido! A base maior tem que ser maior que 0");
            System.exit(0);
        }

        System.out.println("Digite a base menor: ");
        baseMenor = input.nextDouble();
        if (baseMenor <= 0) {
            System.out.println("Valor inválido! A base menor tem que ser maior que 0");
            System.exit(0);
        }

        System.out.println("Digite a altura: ");
        altura = input.nextDouble();
        if (altura <= 0) {
            System.out.println("Valor inválido! A altura tem que ser maior que 0");
            System.exit(0);
        }
        area = (baseMaior + baseMenor) * altura;

        System.out.println("A area do seu base maior: " + area);

        input.close();
    }
}
