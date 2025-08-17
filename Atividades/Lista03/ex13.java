
//13.Faça um programa para converter uma letra maiuscula em letra minúscula.
//Use a tabela ASCII para resolver o problema.

import javax.swing.JOptionPane;

public class ex13 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite uma letra MAIÚSCULA: ");
        char letraMaiuscula = entrada.charAt(0);

        if(letraMaiuscula >= 'A' && letraMaiuscula <= 'Z'){
            char letraMinuscula = (char)(letraMaiuscula + 32);
            JOptionPane.showMessageDialog(null,"Letra minúscula: "+letraMinuscula);
        } else {
            JOptionPane.showMessageDialog(null,"Caractere invalido. Digite apenas uma letra maiúscula.");
        }
    }
}
