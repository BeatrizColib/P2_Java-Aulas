// DO + WHILE + SCANNER + SWITCH

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int repetir;
        int x;

        do {
            System.out.println("Escolha uma opção: 1 A 3...");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Ótima escolha!");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$ 200,00");
                    break;
                case 3:
                    System.out.println("Falar com atendente");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
            System.out.println("Para repetir, digite 0. Para parar digite qualquer número:");
            repetir = sc.nextInt();
        } while (repetir == 0);
    }
}
