package aula02;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        String nome;
        int matricula;
        double salario_bruto;
        double desconto_percentual;
        double salario_liquido;
        double deduçao_inss;

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, Seja bem-vindo(a)!" +
                "\nDigite os dados da pessoa a ser cadastrada" +
                "\n------------------------------------------");
        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite a matrícula: ");
        matricula = sc.nextInt();
        System.out.print("Qual o salário bruto de " + nome.toUpperCase() + "- R$:");
        salario_bruto = sc.nextDouble();

        desconto_percentual = 0.15;
        salario_liquido = salario_bruto - (salario_bruto * desconto_percentual);
        deduçao_inss = salario_bruto - salario_liquido;

        System.out.println("-".repeat(50));
        System.out.println("CONTRACHEQUE");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.printf("Salário bruto: R$ %.2f%n", salario_bruto);
        System.out.printf("Dedução INSS: R$ %.2f%n", deduçao_inss);
        System.out.printf("Salário Líquido: R$ %.2f%n", salario_liquido);
        //para formatar para duas casas decimais: printf ao inves de ln, e virgula no lugar de +
    }
}
