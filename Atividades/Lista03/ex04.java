
//4. Faça um programa que leia o valor de um produto e imprima o valor com
//desconto, tendo em vista que o desconto foi de 12%

import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o valor do produto: R$ ");
            double preco = Double.parseDouble(entrada);

            double desconto = preco * 0.12;
            double valorComDesconto = preco - desconto;

        JOptionPane.showMessageDialog(null,"O produto com desconto fica "+valorComDesconto+" R$");
    }
}
