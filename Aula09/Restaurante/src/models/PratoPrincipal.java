package models;

import enums.TipoRefeicao;
import interfaces.Etapas;

public class PratoPrincipal extends Refeicao implements Etapas {
    //atrib
    private final String tipoPrato = "Prato Principal";
    //atrib. enum
    private TipoRefeicao tipoRefeicao;

    //construtores
    public PratoPrincipal( ) {}

    public PratoPrincipal(String nomePrato, TipoRefeicao tipoRefeicao, String tamanhoPorcao, double precoPrato) {
        super(nomePrato, tamanhoPorcao, precoPrato);
        this.tipoRefeicao = tipoRefeicao;
    }

    //metodos da interface
    @Override
    public void preparar() {
        System.out.println("Preparando prato principal...");
        System.out.println("Preparo finalizado.");
    }

    @Override
    public void temperar() {
        System.out.println("Tempero do prato principal em andamento...");
    }

    @Override
    public void esquentar() {
        System.out.println("Prato principal em temperatura ideal.");
    }

    @Override
    public void servir() {
        System.out.println("Prato principal servir - ok.");
    }

    @Override
    public String toString() {
        return tipoPrato + " | " + tipoRefeicao + ": " + super.toString();
    }
}
