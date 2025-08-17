
//18.Faça a leitura de três valores e apresente como resultado a soma dos
//quadrados dos três valores lidos.

import javax.swing.JOptionPane;


public class ex18 {
    public static void main(String [] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        String entrada2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
        String entrada3 = JOptionPane.showInputDialog("Digite o terceiro valor: ");

        double n1 =Integer.parseInt(entrada1);
        double n2=Integer.parseInt(entrada2);
        double n3=Integer.parseInt(entrada3);

        double resultado = n1*n1+n2*n2+n3*n3;

        JOptionPane.showMessageDialog(null,"O valor da soma dos quadrados dos valores solicitado é "+resultado);
    }
}
