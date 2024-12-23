package model;
import enums.*;

public class Enfermeiro extends Pessoa {
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
}
