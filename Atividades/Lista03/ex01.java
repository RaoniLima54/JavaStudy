
//1. Leia um número inteiro e imprima o seu antecessor e o seu sucessor.

import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Digite o número inteiro: ");
            int numero = Integer.parseInt(entrada);

            int n1 = numero - 1 ;
            int n2 = numero + 1;

        JOptionPane.showMessageDialog(null,"o antecessor é do número "+numero+" é "+n1+" e seu sucessor é "+n2 );
    }
}