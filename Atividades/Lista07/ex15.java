
//15.Determine se um determinado ano lido e bissexto. Sendo que um ano é
//bissexto se for divisível por 400 ou se for divisível por 4 e não for divisível por
//100. Por exemplo: 1988, 1992, 1996

import java.util.Scanner;
public class ex15 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite um ano: ");
            int ano = input.nextInt();

            // condição de ano bissexto
            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                System.out.println("O ano " + ano + " é bissexto.");
            } else {
                System.out.println("O ano " + ano + " NÃO é bissexto.");
            }

            input.close();
        }
    }
