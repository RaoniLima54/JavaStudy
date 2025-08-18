import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double preco = 0;

        // Verificação do código
        switch (codigo) {
            case 100:
                preco = 1.20;
                break;
            case 101:
                preco = 1.30;
                break;
            case 102:
                preco = 0.50;
                break;
            case 103:
                preco = 1.20;
                break;
            case 104:
                preco = 1.70;
                break;
            case 105:
                preco = 2.20;
                break;
            case 106:
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return;
        }

        double total = preco * quantidade;

        // Saída
        System.out.printf("Valor total: R$ %.2f%n", total);

        sc.close();
    }
}
