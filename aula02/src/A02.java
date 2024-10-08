import java.util.Scanner;

public class A02 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int r;    //repetir
        do {
            System.out.println("Informe um número:");
            int x = sc.nextInt();
            System.out.println(x);

            System.out.println("Informe sua média:");
            Double media = sc.nextDouble();
            System.out.println(media);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe seu nome:");
            String nome = scanner.nextLine();
            System.out.println(nome);

            System.out.println("Para repetir digite 0 (zero): ");
            r = sc.nextInt();
        }while (r == 0);
    }
}