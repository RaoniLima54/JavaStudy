
//2. Leia um número inteiro e imprima a soma do sucessor de seu triplo com o
//antecessor de seu dobro.

import javax.swing.JOptionPane;

public class ex02 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um número inteiro: ");
            int numero = Integer.parseInt(entrada);

            int sucessor = (numero * 3) + 1;
            int antecessor = (numero * 2) - 1;

            int resultado = (sucessor + antecessor);

        JOptionPane.showMessageDialog(null,"A soma do sucessor do seu triplo com o antecessor do seu dobro é : " +resultado );
    }
}
