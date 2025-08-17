
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        if (idade < 18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
