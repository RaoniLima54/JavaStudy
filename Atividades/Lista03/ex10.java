
//10.Receba o salário-base de um funcionário. Calcule e imprima o salário a
//receber, sabendo-se que esse funcionário tem uma gratificação de 5% sobre
//o salário-base. Além disso, ele paga 7% de imposto sobre o salário-base.

import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args) {
        String entrada =  JOptionPane.showInputDialog("Digite seu Salario : ");
            double salario = Double.parseDouble(entrada);

            double adicional = salario * 0.05;
            double salarioComAumento = adicional + salario;
            double desconto = salarioComAumento * 0.07;
            double SalarioFinal = salarioComAumento  - desconto;

        JOptionPane.showMessageDialog(null,"O valor do salario com o adicionais de 5% e o desconto de 7% é : "+SalarioFinal);
    }
}
