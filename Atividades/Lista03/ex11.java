
//11. Escreva um programa de ajuda para vendedores. A partir de um valor total
//lido, mostre:
//O total a pagar com desconto de 10%;
//O valor de cada parcela, no parcelamento de 3× sem juros;
//A comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com
//desconto);
//A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor
//total) ;

import javax.swing.JOptionPane;

public class ex11 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o valor total da venda :");
            double venda = Double.parseDouble(entrada);

            double vendaComDesconto = venda * 0.90;
            double parcela = venda / 3;
            double comissaoAvista = vendaComDesconto * 0.05;
            double comissaoParcelada = venda * 0.05;

        String mensagem = String.format("Resumo da venda:\n" +
                        "- Total com 10%% de desconto: R$ %.2f\n" +
                        "- Parcelamento em 3x sem juros: 3x de R$ %.2f\n" +
                        "- Comissão (venda à vista): R$ %.2f\n" +
                        "- Comissão (venda parcelada): R$ %.2f",
                vendaComDesconto, parcela, comissaoAvista, comissaoParcelada
        );

        JOptionPane.showMessageDialog(null,mensagem);
    }
}
