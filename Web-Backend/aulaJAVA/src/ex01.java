
import java.sql.SQLOutput;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");
        int num = input.nextInt();

        System.out.println("Digite um float: ");
        int numF  = input.nextInt();

        System.out.println("Digite um Double: ");
        double numD  = input.nextDouble();

        System.out.println("Digite um nome: ");
        String nome = input.next();

        System.out.println("Digite um único Simbolo: ");
        char simbolo = input.next().charAt(0);


        System.out.println( num+" "+numF+" "+numD+" "+nome+" "+simbolo);
    }
}
