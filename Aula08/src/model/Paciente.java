package model;
import enums.*;

public class Paciente extends Pessoa {
    private String condicao;

    public Paciente(String nome, int idade, String condicao) {
        super(nome, idade);
        this.condicao = condicao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    @Override
    public String getProfissional() {
        return ""; //vazio para ignorar
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "condicao='" + condicao + '\'' +
                '}';
    }
}
