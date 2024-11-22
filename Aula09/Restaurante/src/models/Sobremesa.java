package models;

import enums.TipoRefeicao;
import interfaces.Etapas;

public class Sobremesa extends Refeicao implements Etapas {
    //atrib
    private final String tipoPrato = "Sobremesa";
    //atrib enum
    private TipoRefeicao tipoRefeicao;


    //construtores
    public Sobremesa() {}

    public Sobremesa(String nomePrato, TipoRefeicao tipoRefeicao,String tamanhoPorcao, double precoPrato) {
        super(nomePrato, tamanhoPorcao, precoPrato);
        this.tipoRefeicao = tipoRefeicao;
    }

    //metodos interface

    @Override
    public void preparar() {
        System.out.println("Preparando sobremesa...");
        System.out.println("Preparo finalizado.");

    }

    @Override
    public void servir() {
        System.out.println("Sobremesa pronta para ser servida.");
        System.out.println("Sobremesa servida.");
    }

    @Override
    public void temperar() { //vazio
    }

    @Override
    public void esquentar() { //vazio
    }

    @Override
    public String toString() {
        return tipoPrato + " | " + tipoRefeicao + ": " + super.toString();
    }
}
