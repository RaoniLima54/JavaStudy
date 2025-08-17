
//5. Leia o salário de um funcionário. Calcule e imprima o valor do novo salário,
//sabendo que ele recebeu um aumento de 25%.

import javax.swing.JOptionPane;

public class ex05 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o valor do Salário :R$ ");
            double Salario = Double.parseDouble(entrada);

            double aumento = Salario * 0.25;
            double salarioComAumento = Salario + aumento;

        JOptionPane.showMessageDialog(null,"O salario com aumento é "+salarioComAumento+" R$");
    }
}
