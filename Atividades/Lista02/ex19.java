
//19.Leia quatro notas, calcule a média aritmética e imprima o resultado.

import javax.swing.JOptionPane;

public class ex19 {
    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String entrada2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        String entrada3 = JOptionPane.showInputDialog("Digite a terceira nota: ");

        double nota1 = Integer.parseInt(entrada1);
        double nota2 = Integer.parseInt(entrada2);
        double nota3 = Integer.parseInt(entrada3);

        double resultado = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null,"A media da nota é "+String.format("%.2f",resultado));
    }
}
