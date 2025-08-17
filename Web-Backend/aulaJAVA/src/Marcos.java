import javax.swing.JOptionPane;
public class Marcos {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(
                null,
                    "Marcos rebola para os crias ?",
                    "Pergunta",
                    JOptionPane.YES_NO_OPTION
        );
        if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,"Você esta certo kkkkkkkk\n ele e um safado");
        }else if (resposta == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Você esta errado , vai estudar mais!");
        }else{
                JOptionPane.showMessageDialog(null,"Se não respondeu é porque ele rebola");
        }


    }

}
