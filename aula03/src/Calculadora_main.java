package aula03;

import java.util.Scanner;

public class Calculadora_main {
    public static void main(String[] args) {

        aula03.Calculadora c = new aula03.Calculadora();
        Scanner sc = new Scanner(System.in);

        String continuar;

        do {
            System.out.print("Digite o primeiro número: ");
            c.numero1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            c.numero2 = sc.nextInt();
            System.out.print("Digite a opção do menu referente a operação desejada: " +
                    "\n1 - Somar" +
                    "\n2 - Subtrair" +
                    "\n3 - Multiplicar" +
                    "\n4 - Dividir" +
                    "\n5 - Resto da divisão" +
                    "\nOpção: ");
            c.operacao = sc.nextInt();

            sc.nextLine(); // usado para consumir a linha residual e nao atrapalhar meu continuar abaixo.

            c.calcular();

            System.out.println(String.format("O resultado da operação é: %.2f", c.total)); //formata p/ 2 casas decimais

            System.out.print("Deseja fazer outra operação? Sim (S) ou Não (N): ");
            continuar = sc.nextLine();
            do{
                if (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N")) {
                    System.out.print("Opção inválida! Digite apenas S ou N: ");
                    continuar = sc.nextLine();
                }
            } while (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N"));
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Encerrado! Volte sempre <3");
        sc.close();
    }
}
/* quando tem return eu uso o tipo da variavel que eu
        * retorno, nao usa void. ->aqui o System.out pode ser em
        * qualquer lugar.
        * void eu uso quando coloco um System.out, ou no método
        * ou no main.
        o void nao envia o resultado de volta na Main, eu
        posso enviar, mas automaticamente, ele nao envia.

        ja a opçao de cima, dá o return na Main*/
//ela quer dois exemplos com void e dois exemplos sem.
//jdk 17 , 18 ou 22.
//fazer calculadora com do while/switch/teclado/tudo que aprendeu
