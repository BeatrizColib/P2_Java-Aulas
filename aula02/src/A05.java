//WHILE
package aula02;
import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, digite um número: ");
        int x = sc.nextInt();


        while (x <= 20) {
            System.out.print(x + "-");
            x++;
        }

        System.out.println();
        System.out.println("Olá, digite outro: ");
        int y = sc.nextInt();

        do {
            System.out.print(y++ + " / ");
        } while (y <= 50);
    }
}
