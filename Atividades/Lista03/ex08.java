
//8. Uma empresa contrata um encanador a R$30,00 por dia. Faça ̧a um
//programa que solicite o número de dias trabalhados pelo encanador e
//imprima a quantia lıquida que deverá ser paga, sabendo-se que são
//descontados 8% para imposto de renda.

import javax.swing.JOptionPane;

public class ex08 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog( "Digite o número de dias trabalhados: ");
            int dia = Integer.parseInt(nome);

            int Total = dia * 30;

            double desconto = Total * 0.08;
            double valor = Total - desconto;

        JOptionPane.showMessageDialog(null,"Total a ser pago é : "+valor);
    }
}
