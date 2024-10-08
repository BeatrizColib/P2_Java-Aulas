import java.util.Scanner;

public class Pessoa_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Digite o nome: ");     //nome
        p.setNome(sc.nextLine());
        System.out.println("Nome: "+p.getNome());

        System.out.print("Digite a idade: ");        //idade
        p.setIdade(sc.nextInt());
        System.out.println("A Idade:"+p.getIdade());

        System.out.print("Digite o valor da hora: R$ ");     //calculo salario
        p.setHora_valor(sc.nextDouble());
        System.out.print("Digite as horas trabalhadas: ");
        p.setHoras_trabalhadas(sc.nextDouble());


        System.out.println("Salário foi: R$ "+p.calc());

        //Método calc(): A sugestão que você mencionou está correta.
        //Se o método calc() tiver void, ele não pode retornar um valor e
        //não pode ser chamado diretamente dentro de System.out.println().
        //Como você deseja que ele retorne o salário, o uso de double calc()
        //é apropriado.

        sc.close();  //boa prática: fechar scanner apos o uso.
    }
}