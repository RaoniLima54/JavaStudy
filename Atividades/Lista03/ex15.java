
//15.Gere outro número formado pelos dígitos invertidos do número lido. Exemplo:

import javax.swing.JOptionPane;

public class ex15 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um número inteiro de três dígitos (entre 100 e 999): ");

        try{
            int numero = Integer.parseInt(entrada);

            if(numero >= 100 && numero <= 999){
                int centena =  numero / 100;
                int dezena = (numero % 100) /10;
                int unidades = numero % 10;

                int numeroInvertido = unidades * 100 + dezena * 10 + centena;
                JOptionPane.showMessageDialog(null,"Número original : "+numero+"\nNúmero invertido : " +numeroInvertido);
            } else{
                JOptionPane.showMessageDialog(null,"Número inválido !. Digite um número de 100 a 999.");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Número inválido ! .Digite apenas números inteiros. ");
        }

    }
}
