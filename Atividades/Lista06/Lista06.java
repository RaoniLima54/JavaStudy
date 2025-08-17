
import javax.swing.JOptionPane;

public class Lista06 {
    public static void main(String[] args) {
        String menu = """
                Escolha o exercício:
                1 - Maior entre dois números
                2 - Raiz quadrada se positivo (ou inválido)
                3 - Raiz quadrada ou número ao quadrado
                4 - Ao quadrado e raiz (se positivo)
                5 - Par ou ímpar
                6 - Maior e diferença
                7 - Maior ou iguais
                8 - Média de notas válidas
                9 - Empréstimo (20% do salário)
                10 - Peso ideal (M/F)
                0 - Sair
                """;

        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1 -> maiorNumero();
                case 2 -> raizSePositivo();
                case 3 -> raizOuQuadrado();
                case 4 -> quadradoERaiz();
                case 5 -> parOuImpar();
                case 6 -> maiorEDiferenca();
                case 7 -> maiorOuIguais();
                case 8 -> mediaNotas();
                case 9 -> emprestimo();
                case 10 -> pesoIdeal();
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    // 1
    static void maiorNumero() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        if (a > b)
            JOptionPane.showMessageDialog(null, "Maior número: " + a);
        else if (b > a)
            JOptionPane.showMessageDialog(null, "Maior número: " + b);
        else
            JOptionPane.showMessageDialog(null, "Números iguais.");
    }

    // 2
    static void raizSePositivo() {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        if (n > 0)
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(n));
        else
            JOptionPane.showMessageDialog(null, "Número inválido.");
    }

    // 3
    static void raizOuQuadrado() {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));
        if (n >= 0)
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(n));
        else
            JOptionPane.showMessageDialog(null, "Ao quadrado: " + (n * n));
    }

    // 4
    static void quadradoERaiz() {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        if (n > 0)
            JOptionPane.showMessageDialog(null, "Ao quadrado: " + (n * n) + "\nRaiz quadrada: " + Math.sqrt(n));
        else
            JOptionPane.showMessageDialog(null, "Número inválido.");
    }

    // 5
    static void parOuImpar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        if (n % 2 == 0)
            JOptionPane.showMessageDialog(null, "Par");
        else
            JOptionPane.showMessageDialog(null, "Ímpar");
    }

    // 6
    static void maiorEDiferenca() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int maior = Math.max(a, b);
        int diferenca = Math.abs(a - b);
        JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nDiferença: " + diferenca);
    }

    // 7
    static void maiorOuIguais() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        if (a > b)
            JOptionPane.showMessageDialog(null, "Maior número: " + a);
        else if (b > a)
            JOptionPane.showMessageDialog(null, "Maior número: " + b);
        else
            JOptionPane.showMessageDialog(null, "Números iguais.");
    }

    // 8
    static void mediaNotas() {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        if ((n1 >= 0 && n1 <= 10) && (n2 >= 0 && n2 <= 10)) {
            double media = (n1 + n2) / 2;
            JOptionPane.showMessageDialog(null, "Média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nota inválida. Programa encerrado.");
        }
    }

    // 9
    static void emprestimo() {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
        double prestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação:"));
        if (prestacao > salario * 0.2)
            JOptionPane.showMessageDialog(null, "Empréstimo não concedido.");
        else
            JOptionPane.showMessageDialog(null, "Empréstimo concedido.");
    }

    // 10
    static void pesoIdeal() {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (em metros):"));
        String sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):").toUpperCase();
        if (sexo.equals("M")) {
            double peso = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, "Peso ideal: " + peso);
        } else if (sexo.equals("F")) {
            double peso = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, "Peso ideal: " + peso);
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido.");
        }
    }
}
