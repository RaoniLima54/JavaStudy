
import java.util.Scanner;
import java.util.Arrays;


public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numeros[1] = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        numeros[2] = input.nextInt();

        Arrays.sort(numeros); // ordena o vetor em ordem crescente

        System.out.println("Números em ordem crescente: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        input.close();
    }
}
