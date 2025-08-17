
//6. A importância de R$780.000,00 será dividida entre três ganhadores de um
//concurso. Sendo que da quantia total:
//O primeiro ganhador receberá 46%;
//O segundo receberá 32%;
//O terceiro receberá o restante;
//7. Calcule e imprima a quantia ganha por cada um dos ganhadores.

import javax.swing.JOptionPane;

public class ex06I07 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o valor do prêmio: ");
            double premio = Double.parseDouble(entrada);

            double premio1 = premio * 0.46;
            double premio2 = premio * 0.32;
            double premio3 = premio * 0.22;

        JOptionPane.showMessageDialog(null,"O primeiro prêmio :R$ "+premio1);
        JOptionPane.showMessageDialog(null,"O segundo premio :R$ "+premio2);
        JOptionPane.showMessageDialog(null,"O terceiro premio :R$ "+premio3);


    }
}
