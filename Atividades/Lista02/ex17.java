
//17. Leia um valor de área em hectares e apresente-o convertido em metros
//quadrados é m2. A fórmula de conversão é: M = H ∗ 10000, sendo M a área
//em metros quadrados é H a área em hectares. ́

import javax.swing.JOptionPane;

public class ex17 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o valor da área em hectares: ");
            double H =Double.parseDouble(entrada);

            double m2 = H * 10000;

        JOptionPane.showMessageDialog(null,H+" Hectares é equivalente a "+m2+" m²");
    }


}
