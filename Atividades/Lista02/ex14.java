
//14. Leia um valor de área em metros quadrados m2 e apresente-o convertido em
//acres. A fórmula de conversão é: A = M ∗ 0, 000247, sendo M a área em
//metros quadrados é A a área em acres.

import javax.swing.JOptionPane;

public class ex14 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite a área em metros quadrados (m²):");

        // Conversão de string para double
        double m2 = Double.parseDouble(entrada);

        // Cálculo da conversão
        double acres = m2 * 0.000247;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, m2 + " m² equivalem a " + acres + " acres.");

    }
}
