
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 , num2 , num3;

        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        num3 = input.nextInt();


        System.out.println("Multiplicação: "+(num1*num2*num3));
        System.out.println("Media: "+(num1*num2*num3)/3);
        System.out.println("Resto de 1° pelo 3°"+(num1%num3));

        input.close();

    }
}
