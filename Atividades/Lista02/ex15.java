
//15. Leia um valor de área em acres e apresente-o convertido em metros
//quadrados m2. A fórmula de conversão é: M = A ∗ 4048,58 sendo M a área
//em metros quadrados é A a área em acres.

import javax.swing.JOptionPane;

public class ex15 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o valor do comprimeto em acres: ");
            double acres = Double.parseDouble(entrada);

            double m2 = acres * 4048.58;

        JOptionPane.showMessageDialog(null,acres +" acres equivalem a "+m2+" m²");

    }
}
