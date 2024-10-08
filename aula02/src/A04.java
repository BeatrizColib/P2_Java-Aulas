//FOR + IF + SCANNER + STRINGBUILDER

package aula02;
import java.util.Scanner;

public class A04 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem-vindo!");
        System.out.println("Digite o início: ");
        int inicio = sc.nextInt();

        System.out.println("Digite o fim: ");
        int fim = sc.nextInt();

        System.out.println("Digite o passo/contagem: ");
        int passo = sc.nextInt();


        if (passo > 0) {
            System.out.print("A contagem é: ");
            for (int i = inicio; i <= fim; i +=passo) {
                System.out.print(i + "-");
            }
        } else if (passo < 0) {
            System.out.print("A contagem é: ");
            for (int i = inicio; i >= fim; i += passo) {
                System.out.print(i + "-");
            }
        } else {
            System.out.println("O passo não pode ser 0 (zero)!");
        }
        sc.close(); //fecha o Scanner - para liberar os recursos
    }
}
/*    AQUI PARA FORMATAR E NÃO COLOCAR O ÚLTIMO HÍFEN -
if (passo == 0) {
            System.out.println("O passo não pode ser 0 (zero)!");
        } else {
            System.out.print("A contagem é: ");                       - USA O STRINGBUILDER
            StringBuilder contagem = new StringBuilder();
            if (passo > 0) {
                for (int i = inicio; i <= fim; i += passo) {
                    contagem.append(i).append("-");
                }
            } else {
                for (int i = inicio; i >= fim; i += passo) {
                    contagem.append(i).append("-");
                }
            }
            // Remover o último hífen e imprimir
            System.out.println(contagem.substring(0, contagem.length() - 1));     - REMOVE O ULT HIFEN ANTES DE IMPRIMIR
        }

        sc.close(); // fecha o Scanner - para liberar os recursos
 */
