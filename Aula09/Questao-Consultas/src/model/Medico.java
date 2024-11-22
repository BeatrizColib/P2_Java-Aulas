package model;
import enums.*;

public class Medico extends Pessoa implements Funcao{
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

    //transf. polimorfica
    public void responsabilidade(){
        System.out.println("Responsabilidade do médico: atender, evoluir, internar, fazer procedimentos, dar alta e reportar à família a situação do paciente.");
    }

    @Override
    public void estabelecerFuncao() {
        System.out.println("função do médico: diagnosticar");
    }
}
