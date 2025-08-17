
//4. A nota final de um estudante é calculada a partir de três notas atribuídas
//entre o intervalo de 0 até 10, respectivamente, a um trabalho de laboratório, a
//uma avaliação semestral e a um exame final. A média das três notas
//mencionadas anteriormente obedece aos pesos: Trabalho de Laboratório: 2;
//Avaliação Semestral: 3; Exame Final:5
//De acordo com o resultado, mostre na tela se o aluno está reprovado (média
//entre 0 e 2,9), de recuperac ̧ao (entre 3 e 4,9) ou se foi aprovado. Faça todas
//as verificações necessárias.

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex04e05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = input.nextDouble();

        double media = ((n1*2)+(n2*3)+(n3*5))/10;
        System.out.println("A média final: "+ media );

        if (media>=0 && media<=2.9){
        System.out.println("Aluno reprovado");
        } else if (media>=3 && media<=4.9) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Aluno Aprovado!");
        }
        input.close();

    }
}
