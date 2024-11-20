package model;
import enums.*;

public class Medico extends Pessoa {
    private final Profissional profissional = Profissional.Médico;
    private Especializacao especializacao;

    public Medico(String nome, int idade, Especializacao especializacao){
        super(nome, idade);
        this.especializacao = especializacao;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String getProfissional() {
        return profissional.toString(); //.toString converte o enum numa string - corrige o erro
        //"java: incompatible types: enums.Profissional cannot be converted to java.lang.String"
    }

    @Override
    public String toString() {
        return super.toString() + "especializacao" + especializacao;
    }
}
