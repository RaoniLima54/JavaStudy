
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (Km): ");
        double distancia = input.nextDouble();

        System.out.print("Digite a quantidade de litros de gasolina consumidos: ");
        double litros = input.nextDouble();

        double consumo = distancia / litros; // Km/l

        System.out.println("Consumo: " + consumo + " Km/l");

        if (consumo < 8) {
            System.out.println("Venda o carro!");
        } else if (consumo <= 14) {
            System.out.println("Econômico!");
        } else {
            System.out.println("Super econômico!");
        }

        input.close();
    }
}

