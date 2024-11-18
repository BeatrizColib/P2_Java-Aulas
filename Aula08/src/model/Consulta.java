package model;
import enums.*;
import java.time.LocalDate;

public class Consulta {
    private LocalDate dataConsulta;
    private Pessoa profissional;  //medico, enfermeiro...
    private Paciente paciente;
    private Especializacao especializacao; //esp. do medico (opcional p/ enferm)
    private String getCondicao;

    //construtor
    public Consulta(LocalDate dataConsulta, Pessoa profissional, Paciente paciente, Especializacao especializacao, String condicao){
        this.dataConsulta = dataConsulta;
        this.profissional = profissional;
        this.paciente = paciente;
        this.especializacao = especializacao;
        this.getCondicao = condicao;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Pessoa getProfissional() {
        return profissional;
    }

    public void setProfissional(Pessoa profissional) {
        this.profissional = profissional;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

    public String getGetCondicao() {
        return getCondicao;
    }

    public void setGetCondicao(String getCondicao) {
        this.getCondicao = getCondicao;
    }

    @Override
    public String toString() {
        String profissionalDados = profissional.getProfissional() + ": " + profissional.getNome() +
                ", Idade: " + profissional.getIdade() +
                (especializacao != null ? ", Especialização: " + especializacao : "");

        String pacienteDados = "Paciente: " + paciente.getNome() +
                ", Idade: " + paciente.getIdade() +
                ", Condição: " + paciente.getCondicao();

        return "Consulta: " + dataConsulta +
                "\n" + profissionalDados +
                "\n" + pacienteDados;
    }
}
