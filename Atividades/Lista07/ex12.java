
//12.Dados três valores, A, B, C, verificar se eles podem ser valores dos lados de
//um triangulo e, se forem, se e um triângulo escaleno, equilátero ou isóscele,
//considerando os seguintes conceitos:
//        ● O comprimento de cada lado de um triângulo é menor do que a somados outros dois lados.
//        ● Chama-se equilátero o triângulo que tem três lados iguais.
//        ● Denominam-se isósceles o triângulo que tem o comprimento de dois lados iguais.
//        ● Recebe o nome de escaleno o triângulo que tem os três lados diferentes.


import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor do lado do triângulo: ");
        int A = input.nextInt();

        System.out.println("Digite o segundo valor do lado do triângulo: ");
        int B = input.nextInt();

        System.out.println("Digite o terceiro valor do lado do triângulo: ");
        int C = input.nextInt();

        int soma = A + B + C;


        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("O trinâgulo é equilátero");
            } else if (A == B || C == B || A == C) {
                System.out.println("O trinâgulo é isósceles");
            } else {
                System.out.println("o trinâgulo é escaleno");
            }
        }else{
            System.out.println("Os lados NÃO formam um triângulo ");
        }
        input.close();
    }
}
