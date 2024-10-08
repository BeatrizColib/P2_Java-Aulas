package aula04;

public class Tutorial_main {
    public static void main(String[] args) {
        // Cria uma pessoa com nome "José"
        aula04.Tutorial pessoa = new aula04.Tutorial("José");

        // Acessa o nome usando o método get
        System.out.println("Nome: " + pessoa.getNome02());  // Saída: Nome: José

        // Modifica o nome usando o método set com validação
        pessoa.setNome02("Maria");

        // Acessa o novo nome
        System.out.println("Novo nome: " + pessoa.getNome02());  // Saída: Novo nome: Maria

        // Tenta modificar o nome para um valor inválido
        pessoa.setNome02("");  // Saída: Nome não pode ser vazio.
    }
}