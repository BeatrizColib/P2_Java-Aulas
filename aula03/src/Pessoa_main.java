package aula03;
import java.util.Scanner;

public class Pessoa_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        aula03.Pessoa p = new aula03.Pessoa();

        System.out.println("Digite o nome: ");
        p.nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        p.idade = sc.nextInt();

        System.out.println("A idade de " + p.nome + " é: " + p.idade);
        p.niver();

        System.out.println("A próxima será: " + p.idade);
    }
}
