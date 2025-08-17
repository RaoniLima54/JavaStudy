
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade < 16 | idade > 69) {
            System.out.println("Você não pode doar !");
        }else if (idade>=16 && idade< 18){
            System.out.println("Pode com autorização");
        }else{
            System.out.println("Pode doar");
        }
    }
}
