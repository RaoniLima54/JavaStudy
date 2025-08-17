
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RelogioDaVida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();

        try {
            // Converte para LocalDate
            LocalDate dataNascimento = LocalDate.parse(dataStr, formato);
            LocalDate hoje = LocalDate.now();

            // Calcula a diferença em dias
            long diasVividos = ChronoUnit.DAYS.between(dataNascimento, hoje);

            System.out.println("Você já viveu aproximadamente " + diasVividos + " dias.");
        } catch (Exception e) {
            System.out.println("Formato inválido! Use o formato dd/MM/yyyy.");
        }

        scanner.close();
    }
}
