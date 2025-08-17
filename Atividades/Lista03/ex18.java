
//18.Faça um programa para ler o horário (hora, minuto e segundo) de início e a
//duração, em segundos, de uma experiência biológica. O programa deve
//resultar com o novo horário (hora, minuto e segundo) do término da mesma.

import javax.swing.JOptionPane;

public class ex18 {
    public static void main(String[] args) {

        int horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Hora de início (0-23):"));
        int minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Minuto de início (0-59):"));
        int segundoInicio = Integer.parseInt(JOptionPane.showInputDialog("Segundo de início (0-59):"));


        int duracaoSegundos = Integer.parseInt(JOptionPane.showInputDialog("Duração da experiência (em segundos):"));

        int totalSegundosInicio = horaInicio * 3600 + minutoInicio * 60 + segundoInicio;

        int totalFinalSegundos = totalSegundosInicio + duracaoSegundos;

        int horaFinal = (totalFinalSegundos / 3600) % 24;  // % 24 para não passar de 23h
        int minutoFinal = (totalFinalSegundos % 3600) / 60;
        int segundoFinal = totalFinalSegundos % 60;

        String resultado = String.format("Horário de término: %02d:%02d:%02d", horaFinal, minutoFinal, segundoFinal);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
