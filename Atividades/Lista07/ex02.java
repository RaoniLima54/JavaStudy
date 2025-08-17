
//2. Ler um número inteiro. Se o número lido for negativo, escreva a mensagem
//“Numero invalido”. Se o número for positivo, calcular o logaritmo deste
//número.

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1;

      while(true){
          System.out.println("Digite um número inteiro: ");
          n1 = input.nextInt();

          if(n1<0){
              System.out.println("Número invalido");
              break;
          }

          if(n1==0){
              System.out.println("Logaritmo de 0 não exite! Tente novamente");
              continue;
          }

          double log = Math.log(n1);
          System.out.println("Logaritmo de " + log);
          break;
      }
      input.close();
    }
}
