package aula03;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome;
        double nota_01;
        double nota_02;
        double media;
        String situacao;
        String continuar;

        do {
            System.out.print("Nome do/a aluno/a: ");
            nome = sc.nextLine();
            System.out.print("Primeira nota (0 a 100): ");
            nota_01 = sc.nextDouble();
            System.out.print("Segunda nota (0 a 100): ");
            nota_02 = sc.nextDouble();


            media = (nota_01 + nota_02) / 2;

            if (media >= 70) {
                System.out.println("Aluno/a aprovado/a!");
            } else if (media >= 40 && media <70) {
                System.out.println("Aluno/a na final!");
            } else {
                System.out.println("Aluno/a reprovado/a!");
            }

            sc.nextLine();
            System.out.print("Deseja cadastrar mais um aluno? Sim (S) ou Não (N): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("S"));
        System.out.println("Encerrado!");
    }
}
