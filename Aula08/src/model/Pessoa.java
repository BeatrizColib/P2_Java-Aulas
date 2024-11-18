package model;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //corrigindo erro na consulta que nao estava conseguindo pegar o get Profissional
    //porem no paciente, criei um pois aqui é abstract
    public abstract String getProfissional();

    @Override
    public String toString(){
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
