package models;

import enums.TipoRefeicao;
import interfaces.Etapas;

public class Entrada extends Refeicao implements Etapas {
    //atributos
    private final String tipoPrato = "Entrada";
    //atrib. do enum
    private TipoRefeicao tipoRefeicao; //atrib do tipo enum - chamando ele

    //construtores
    public Entrada() {}

    public Entrada(String nomePrato, TipoRefeicao tipoRefeicao, String tamanhoPorcao, double precoPrato) {
        super(nomePrato, tamanhoPorcao, precoPrato);
        this.tipoRefeicao = tipoRefeicao;
    }

    //metodos da interface
    @Override
    public void preparar() {
        System.out.println("Preparando Entrada.");
        System.out.println("Preparo - ok.");
    }

    @Override
    public void temperar() {
        System.out.println("Temperando entrada.");

    }

    @Override
    public void esquentar() {
        System.out.println("Entrada em temperatura correta para servir");
    }

    @Override
    public void servir() {
        System.out.println("Servindo entrada.");

    }

    //toString
    @Override
    public String toString() {
        return tipoPrato + " | " + tipoRefeicao + ": " + super.toString();
    }
}
