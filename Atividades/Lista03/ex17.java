
//17.Leia um valor inteiro em segundos, e imprima-o em horas, minutos e
//segundos.

import javax.swing.JOptionPane;

public class ex17 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o tempo em segundos:  ");

        if (entrada != null && entrada.matches("\\d+")) {
            int seg = Integer.parseInt(entrada);

            int horas = seg / 3600;
            int minutos = seg % 3600 / 60;
            int segundos = seg % 60;

            String resuntado = String.format("%02d:%02d:%02d", horas, minutos , segundos);
            JOptionPane.showMessageDialog(null,resuntado);
        }else {
            JOptionPane.showMessageDialog(null, "Valor inválaido. Digite um valor inteiros.");
        }
    }
}
