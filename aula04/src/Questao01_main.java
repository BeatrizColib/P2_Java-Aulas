package aula04;

import java.util.Scanner;

public class Questao01_main {
    public static void main(String[]args) {

        aula04.Questao01 q = new aula04.Questao01();

        System.out.println("O funcionário " + q.getNome01() + ":" +
                "\n trabalha "+ q.getQuantidade_horas() + " horas" +
                "\n e ganha R$ " + q.getSalario() + " num total de " + q.getValor_hora() + " por hora.");
    }

}
//aqui apenas faço o public, instancio meu arquivo principal
//e coloco os prints, caso tenha teclado também.