// EmpregadoTeste.java
public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("João", "Silva", 2500);
        Empregado emp2 = new Empregado("Maria", "Souza", 3000);

        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() + " - Salário anual: R$" + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() + " - Salário anual: R$" + emp2.getSalarioAnual());

        emp1.aplicarAumento(10);
        emp2.aplicarAumento(10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() + " - Salário anual: R$" + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() + " - Salário anual: R$" + emp2.getSalarioAnual());
    }
}

