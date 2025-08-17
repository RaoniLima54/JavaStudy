
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a distância percorida em KM : ");
        int distancia = input.nextInt();

        System.out.println("Qual foi o tempo do percurso em Horas : ");
        double tempoPercurso = input.nextDouble();


        double vm = distancia / tempoPercurso;

        if(vm>120){
            System.out.println("MULTADO!");
        }else{
            System.out.println("TARTARUGA!!! ");
        }
    }
}
