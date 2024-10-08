import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //EXERCÍCIO 01
    public static void main(String[] args) {
        int horas = 40;
        int valor_hora = 15;
        int salario;

        salario = horas * valor_hora;
        System.out.println("O salário é: R$ " + salario);

        //EXERCÍCIO 02
        int valor1 = 10;
        int valor2 = 25;

        if(valor1 > valor2) {
            System.out.println("O valor 1 é maior que o valor 2!");
        } else if (valor1 == valor2) {
            System.out.println("Os valores são iguais!");
        } else {
            System.out.println("O valor 2 é maior que o valor 1!");
        }
        //EXERCÍCIO 03
        int nota1 = 9;
        int nota2 = 10;
        int nota3 = 8;
        double media;
        media = (nota1 + nota2 + nota3) / 3;

        if(media>=7){
            System.out.print("O/A aluno/a está aprovado/a!");
        } else if (media<7 && media >=4) {
            System.out.print("O/A aluno/a está em recuperação!b");
        } else {
            System.out.print("O/A aluno/a está reprovado/a!b");
        }
        System.out.printf("A média é %.2f ", media); //%2.f formata para aparecer duas casas decimais
        System.out.println();

        //EXERCÍCIO 04
        double salario1 = 2500.00;
        double desconto1 = salario1 * 0.05;
        double salariofinal1 = salario1 * 0.95;
        double desconto2 = salario1 * 0.10;
        double salariofinal2 = salario1 * 0.90;
        double desconto3 = salario1 * 0.20;
        double salariofinal3 = salario1 * 0.80;

        if (salario1 < 901) {
            System.out.println("Está isento de dedução para IR. O salário é: R$ " + salario1);
        }
        else if (salario1 >= 901 && salario1 <= 1500)
        {
            System.out.println("O Desconto para o IR é de 5%, total de R$ " + desconto1 + " Salário final: R$ " + salariofinal1);
        }
        else if (salario1 >= 1501 && salario1 <= 2500) {
            System.out.println("O desconto para o IR é de 10%, total de R$ " + desconto2 + " Salário final é: R$ " + salariofinal2);
        }
        else {
            System.out.println("O desconto para IR é de 20%, total de R$ " + desconto3 + " Salário final é: R$ " + salariofinal3);
        }
    }
}