
//13.Escreva o menu de opções abaixo. Leia a opção do usuário e execute a
//operação escolhida. Escreva uma mensagem de erro se a opção for inválida.
//            Escolha a opção:
//          1- Soma de 2 números.
//          2- Diferença entre 2 números (maior pelo menor).
//          3- Produto entre 2 números.
//          4- Divisão entre 2 números (o denominador não pode ser zero).
//          Opção


import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a opção: ");
        System.out.println("1 - Soma de 2 números.");
        System.out.println("2- Diferença entre 2 números (maior pelo menor).");
        System.out.println("3- Produto entre 2 números.");
        System.out.println("4- Divisão entre 2 números (o denominador não pode ser zero).");
        System.out.println("0- sair");
        int op = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o primeiro número: ");
                int n1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                int n2 = input.nextInt();

                int soma = n1 + n2;
                System.out.println("A soma dos números "+n1+" + "+n2+" é "+soma);
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                int dn1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                int dn2 = input.nextInt();

                if(dn1<dn2){
                    double div = dn2/dn1;
                    System.out.println("A divisão do números é igual a "+div);
                    break;
                }else if(dn1>dn2){
                    double div = dn1/dn2;
                    System.out.println("A divisão do números é igual a "+div);
                    break;
                }else{
                    break;
                }

            case 3:
                System.out.println("Digite o primeiro número: ");
                int pn1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                int pn2 = input.nextInt();

                int produto = pn1 * pn2;
                System.out.println("O produto dos números "+pn1+" e "+pn2+" e igual a "+produto);
                break;

            case 4:
                System.out.println("Digite o divisor : ");
                int d1 = input.nextInt();
                System.out.println("Digite o dividendo: ");
                int d2 = input.nextInt();

                if(d2==0){
                    System.out.println("Divisão por zero Inválida!!!");
                    break;
                }else{
                    int d = d1/d2;
                    System.out.println("A divisão é igual a "+d);
                    break;
                }
                default:
        }
        input.close();
    }
}
