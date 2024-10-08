//equalsIgnoreCase();
package aula02;
import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        String nome;
        String continuar;
        int idade;

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite o nome a ser cadastrado: ");
            nome = scanner.nextLine();
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            System.out.print("Para cadastrar outro, digite S: ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));
    }
}
