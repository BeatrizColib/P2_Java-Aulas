package aula02;
import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {
        double nota;
        double soma_notas = 0; //tenho que colocar =0 porque senão dará erro ao somar com outro valor
        double media;
        int cont = 0; //idem
        String continuar;

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo/a ao calculador de média do aluno!");
        do {
            System.out.print("Insira uma nota do aluno: ");
            nota = sc.nextDouble();
            System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): ");
            continuar = scanner.nextLine();
            soma_notas += nota;
            cont++;
        } while (continuar.equalsIgnoreCase("S"));

        media = soma_notas / cont;
        System.out.println();
        System.out.println("Média das notas: " + media);
        System.out.println("Obrigado por usar o programa!");
    }
}
