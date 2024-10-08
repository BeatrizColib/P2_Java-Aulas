package aula02;
import java.util.Scanner;

public class A03 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem-vindo!");
        System.out.println("Digite o início: ");
        int inicio = sc.nextInt();

        System.out.println("Digite o fim: ");
        int fim = sc.nextInt();

        System.out.println("Digite o passo/contagem: ");
        int passo = sc.nextInt();

        System.out.println("A contagem é: ");
        for(int i = inicio; i <= fim; i+= passo) {
            System.out.print(i + "-");
        }
    }
}
