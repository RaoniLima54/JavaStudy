
// 3. Peça ao usuário para digitar três valores inteiros e imprima a soma deles.

import java.util.Scanner;
import java.util.ArrayList;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
                int n1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
                int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
                int n3 = scanner.nextInt();

        int soma = n1 + n2 + n3;

        System.out.println("O valos da soma é: " + soma);


        //System.out.println(n1+n2+n3);




           //*Como print todos os numero solicitados no console*//


        //System.out.print("Os numeros são: " + n1 + "," + n2 + "," +n3);

        /*
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        */

    }
}
