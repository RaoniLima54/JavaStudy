
//16. Leia um valor de área em metros quadrados m2 e apresente-o convertido em
//hectares. A formula de conversaõ é: H = M ∗ 0, 0001, sendo M a area em
//metros quadrados é H a area em hectares.

import javax.swing.JOptionPane;

public class ex16 {
    public static void main(String[] args) {
        String entrada =JOptionPane.showInputDialog("Digite o valor em m² : ");
            double m2 =Double.parseDouble(entrada);

            double H = m2 * 0.0001;

        JOptionPane.showMessageDialog(null,m2+" m² equivalem a "+H+" hectares.");
    }
}
