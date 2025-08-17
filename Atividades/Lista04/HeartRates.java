
//3. Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o
//nome, sobrenome e data de nascimento da pessoa (consistindo em atributos
//separados para mês, dia e ano de nascimento). Sua classe deve ter um
//construtor que receba esses dados como parâmetros. Para cada atributo,
//forneça métodos set e get. A classe também deve incluir um método que
//calcule e retorne a idade (em anos), um que calcule e retorne a frequência
//cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da
//pessoa.

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaDoNascimento;
    private int mesDoNascimento;
    private int anoDoNascimento;

    public HeartRates(String nome ,String sobrenome, int dia, int mes, int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaDoNascimento = dia;
        this.mesDoNascimento = mes;
        this.anoDoNascimento = ano;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSobrenome() {
        return sobrenome;
    }
    public void setsobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public int getDiaDoNascimento() {
        return diaDoNascimento;
    }
    public void setDiaDoNascimento(int diaDoNascimento) {this.diaDoNascimento = diaDoNascimento;}


    public int getMesDoNascimento() {return mesDoNascimento;}
    public void setMesDoNascimento(int mesDoNascimento) {this.mesDoNascimento = mesDoNascimento;}

    public int getAnoDoNascimento() {return anoDoNascimento;}
    public void setAnoDoNascimento(int anoDoNascimento) {this.anoDoNascimento = anoDoNascimento;}

    public int getIdade(){
        LocalDate dataNascimento = LocalDate.of(anoDoNascimento,mesDoNascimento,diaDoNascimento);
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public int getFrequenciaCardiacaMaxima(){
        return 220 - getIdade();
    }

    public String getFrequenciaCardiacaAlvo(){
        int fcm = getFrequenciaCardiacaMaxima();
        int min = (int)(fcm * 0.50);
        int max = (int)(fcm * 0.85);
        return min + " - " + max + " bpm";
    }

}






