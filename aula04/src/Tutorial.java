package aula04;

public class Tutorial {
    private String nome02;  // Atributo privado

    // Construtor
    public Tutorial(String nome02) {
        this.nome02 = nome02;  // Inicializa o nome02 com o valor passado no construtor
    }

    // Método getter para acessar o nome
    public String getNome02() {
        return nome02;
    }

    // Método setter para modificar o nome sem validação
    public void setNome(String nome02) {
        this.nome02 = nome02;  // Atualiza o atributo nome02 com o valor passado
    }

    // Método setter para modificar o nome, com validação
    public void setNome02(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio.");
        } else {
            this.nome02 = nome;  // Atualiza o atributo nome02 se a validação passar
        }
    }
}

/*this.nome02: refere-se ao atributo da classe (ou seja, a variável
 nome02 que foi declarada no início da classe).
nome: é o parâmetro passado para o método setNome02.
Se você escrevesse this.nome02 = nome02; dentro do método setNome02,
o compilador tentaria atribuir o valor do próprio atributo nome02 a si
mesmo, o que não faria sentido, porque o objetivo é atualizar o valor
 do atributo com o valor passado pelo parâmetro.
 nome conteria "Maria".
this.nome02 receberia "Maria", o que significa que o atributo
nome02 da classe seria atualizado com o valor "Maria".
 */