
//12.Receba a altura do degrau de uma escada e a altura que o usuário deseja
//alcançar subindo a escada. Calcule e mostre quantos degraus o usuário
//deverá subir para atingir seu objetivo.

import javax.swing.JOptionPane;

public class ex12 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite e a altura do degrau: cm ");
            double degrau = Double.parseDouble(entrada);

        String entrada2 = JOptionPane.showInputDialog("Digite a altura que deseja alcançar: m ");
            double altura = Double.parseDouble(entrada2);

            double escada = (altura * 100) / degrau ;

        JOptionPane.showMessageDialog(null,"Você vai precisar de "+escada+ " degraus  para chegar lá ");
    }
}
