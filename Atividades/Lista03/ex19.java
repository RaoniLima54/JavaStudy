
//19.Implemente um programa que calcule o ano de nascimento de uma pessoa a
//partir de sua idade e do ano atual.


import javax.swing.JOptionPane;

public class ex19 {
    public static void main(String[] args) {

        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(idadeStr);

        String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual:");
        int anoAtual = Integer.parseInt(anoAtualStr);

        int anoNascimento = anoAtual - idade;

        String resultado = "Você nasceu em: " + anoNascimento;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
