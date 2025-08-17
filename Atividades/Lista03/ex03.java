
//3. Leia o tamanho do lado de um quadrado e imprima como resultado a sua
//área.

import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite a tamanho do lado do quadrado: ");
            int T = Integer.parseInt(entrada);

            int A = (int) Math.pow(T,3);

        JOptionPane.showMessageDialog(null,"A área do quadrado de lado "+T+" é igual a "+A );

    }
}
