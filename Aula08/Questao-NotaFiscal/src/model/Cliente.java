package model;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCPF: " + cpf + "\n";
    }
}
