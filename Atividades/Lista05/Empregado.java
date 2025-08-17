public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome=nome;}

    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public double getsalarioMensal() {return salarioMensal;}
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = (salarioMensal > 0) ? this.salarioMensal : 0.0;
    }
    public double getSalarioAnual() {
       return salarioMensal * 12 ;
    }

    public void aplicarAumento(double percentual){
        if (percentual > 0){
            salarioMensal += salarioMensal * (percentual / 100);
        }
    }
}
