
//16.Leia um número inteiro de 4 dígitos (de 1000 a 9999) e imprima 1 dígito por
//linha.

import javax.swing.JOptionPane;

public class ex16 {
    public static void main(String[] args) {
        while (true) {
            String numeroStr = JOptionPane.showInputDialog("Digite um número de 4 dígitos (entre 1000 e 9999):");

            if (numeroStr == null) {
                JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                break;
            }

            if (numeroStr.matches("\\d{4}")) {
                char d1 = numeroStr.charAt(0);
                char d2 = numeroStr.charAt(1);
                char d3 = numeroStr.charAt(2);
                char d4 = numeroStr.charAt(3);

                String resultado = "Dígitos separados do número "+numeroStr+" :\n" + d1 + "\n" + d2 + "\n" + d3 + "\n" + d4;
                JOptionPane.showMessageDialog(null, resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido. Digite exatamente 4 dígitos.");
                // Opcional: encerrar se digitar errado
                break;
            }
        }
    }
}
