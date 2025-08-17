import java.util.Scanner;

public class TesteHeartRates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("Digite seu dia do nascimento: ");
        int dia = input.nextInt();

        System.out.println ("Digite seu mes do nascimento: ");
        int mes = input.nextInt();

        System.out.println ("Digite seu ano do nascimento: ");
        int ano = input.nextInt();

        HeartRates pessoas = new HeartRates(nome , sobrenome, dia, mes, ano);

        System.out.println("\n---Informações da pessoa --- ");
        System.out.println("Nome: "+pessoas.getNome()+ " " + pessoas.getSobrenome());
        System.out.println("Data de nascimento: " + pessoas.getDiaDoNascimento()+ "/" + pessoas.getMesDoNascimento() + "/" +  pessoas.getAnoDoNascimento() );
        System.out.println("Idade :" + pessoas.getIdade()+" anos");
        System.out.println("Frequência Cardíaca Máxima: "+ pessoas.getFrequenciaCardiacaMaxima()+" bpm");
        System.out.println("Frenquência Cardíaca Alvo: "+ pessoas.getFrequenciaCardiacaAlvo());

        input.close();
    }
}
