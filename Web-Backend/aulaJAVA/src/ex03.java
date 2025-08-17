

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual anos você nasceu : ");
        int anos = input.nextInt();

        System.out.println("Qual mês você nasceu : ");
        int mes = input.nextInt();

        System.out.println("Qual seu dia de nascimento : ");
        int dia = input.nextInt();


        int anosEmDias = anos * 365;
        int mesEmDias = mes * 30;

        System.out.println("Você viveu "+(dia+anosEmDias+mesEmDias)+" dias");



    }
}
