
//14.Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode
//ou não se aposentar. As condições para aposentadoria são
//             ● Ter pelo menos 65 anos,
//             ● Ou ter trabalhado pelo menos 30 anos,
//             ● Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.


import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do trabalhor: ");
        int idade = input.nextInt();

        System.out.println("Digite o tempo de serviço (em anos): ");
        double tempoServico = input.nextDouble();

        if(idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico>=25)){
            System.out.println("O trabalhador PODE se aposentar.");
        }else{
            System.out.println("O trabalhador NÃO PODE se aposentar.");
        }
        input.close();
    }
}
