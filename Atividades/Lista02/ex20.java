
//20.Leia um valor em real e a cotação do dólar. Em seguida, imprima o valor
//correspondente em dólares.

import javax.swing.JOptionPane;

public class ex20   {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o primeiro valor em reais: ");
            double real = Double.parseDouble(entrada);

            double dol = real / 5.54;

        JOptionPane.showMessageDialog(null,real+" reais é equivalente a "+String.format("%.2f",dol)+" dolar");
    }
}
