import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    private static String classificarPrecoNovo(double precoNovo) {
        if (precoNovo <= 80.0) return "Barato";
        else if (precoNovo <= 120.0) return "Normal";
        else if (precoNovo <= 200.0) return "Caro";
        else return "Muito caro";
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço antigo: ");
        double precoAntigo = sc.nextDouble();

        double percentual;
        if (precoAntigo <= 50.0) {
            percentual = 0.05;
        } else if (precoAntigo <= 100.0) {
            percentual = 0.10;
        } else {
            percentual = 0.15;
        }

        double aumento = precoAntigo * percentual;
        double precoNovo = precoAntigo + aumento;

        String mensagem = classificarPrecoNovo(precoNovo);

        System.out.printf("Percentual aplicado: %.0f%%%n", percentual * 100);
        System.out.printf("Aumento: R$ %.2f%n", aumento);
        System.out.printf("Preço novo: R$ %.2f%n", precoNovo);
        System.out.println("Classificação (preço novo): " + mensagem);

        sc.close();
    }
}
