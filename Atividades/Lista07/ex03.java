//3. Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A
//primeira e a segunda prova tem peso 1 e a terceira tem peso 2. Ao final,
//mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado. A
//nota para aprovação deve ser igual ou superior a 60 pontos.

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        n3 = input.nextDouble();

        double media = ((n1*1)+(n2*1)+(n3*2))/(1+1+2);

        System.out.println("A média ponderda do aluno é: " + media);

        if(media>=60){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }

        input.close();
    }
}
