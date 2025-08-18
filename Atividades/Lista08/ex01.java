
import java.util.Scanner;

public class ex01 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o valor do produto: ");
            double valor = input.nextDouble();


            System.out.print("Digite o estado de destino (MG, SP, RJ, MS): ");
            String estado = input.next().toUpperCase();

            double precoFinal;

            switch (estado) {
                case "MG":
                    precoFinal = valor * 1.07;
                    System.out.println("Preço final com imposto (MG): R$ " + precoFinal);
                    break;

                case "SP":
                    precoFinal = valor * 1.12;
                    System.out.println("Preço final com imposto (SP): R$ " + precoFinal);
                    break;

                case "RJ":
                    precoFinal = valor * 1.15;
                    System.out.println("Preço final com imposto (RJ): R$ " + precoFinal);
                    break;

                case "MS":
                    precoFinal = valor * 1.08;
                    System.out.println("Preço final com imposto (MS): R$ " + precoFinal);
                    break;

                default:
                    System.out.println("Erro: Estado inválido!");
                    break;
            }

            input.close();
        }
    }


