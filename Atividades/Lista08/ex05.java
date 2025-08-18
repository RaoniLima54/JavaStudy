import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a altura (em metros, exemplo 1.65): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();

        char classificacao;


        if (altura < 1.20) {
            if (peso <= 60) {
                classificacao = 'A';
            } else if (peso <= 90) {
                classificacao = 'D';
            } else {
                classificacao = 'G';
            }
        } else if (altura >= 1.20 && altura <= 1.70) {
            if (peso <= 60) {
                classificacao = 'B';
            } else if (peso <= 90) {
                classificacao = 'E';
            } else {
                classificacao = 'H';
            }
        } else {
            if (peso <= 60) {
                classificacao = 'C';
            } else if (peso <= 90) {
                classificacao = 'F';
            } else {
                classificacao = 'I';
            }
        }

        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}

