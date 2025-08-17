
//9. Faça um programa que leia o valor da hora de trabalho (em reais) e o número
//de horas trabalhadas no mês. Imprima o valor a ser pago ao funcionário,
//adicionando 10% sobre o valor calculado.

import javax.swing.JOptionPane;

public class ex09 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o valor da hora trabalhada em reais : R$ ");
            double hora = Double.parseDouble(entrada);
        String entrada2 =JOptionPane.showInputDialog("Digite o número de dias trabalhados: ");
            int dias = Integer.parseInt(entrada2);

            double Salario = hora*dias;
            double adicional = Salario * 0.10;
            double Total = Salario + adicional;

        JOptionPane.showMessageDialog(null,"O valor do salário trabalhando "+dias+" dias e com adicional aplicado é de "+Total);
    }
}
