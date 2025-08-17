
//14.Faça um programa que leia um número inteiro positivo de três dígitos (de 100
//a 999).

import javax.swing.JOptionPane;

public class ex14 {
    public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número inteiro positivo de três dígitos ");
    int numero = Integer.parseInt(entrada);

    if(numero >= 100  && numero <= 999) {
        JOptionPane.showMessageDialog(null,"O numero é: "+numero);
    }else {
        JOptionPane.showMessageDialog(null,"Número invalido! ");
    }
    }
}
