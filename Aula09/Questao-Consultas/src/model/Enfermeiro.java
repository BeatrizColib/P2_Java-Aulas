package model;
import enums.*;

public class Enfermeiro extends Pessoa implements Funcao{
    private final Profissional profissional = Profissional.Enfermeiro; //prof. fica fixa em enfermeiro

    public Enfermeiro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String getProfissional() {
        return profissional.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //polimorfismo
    public void responsabilidade(){
        System.out.println("Responsabilidade do enfermeiro: administrar medicamentos, higienizar, checar sinais.");
    }

    @Override
    public void estabelecerFuncao() {
        System.out.println("Função do enfermeiro: acompanhar paciente");
    }
}
