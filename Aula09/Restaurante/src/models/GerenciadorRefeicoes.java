package models;
import interfaces.Etapas;

//classe para centralizar a logica do polimorfismo, porem nao precisa ter.
//pois ele já acontece quando usa-se uma classe pai p/ manipular objetos das classes filhas.

public class GerenciadorRefeicoes {
    public void gerenciarRefeicao(Etapas etapas){
        etapas.preparar();
        etapas.temperar();
        etapas.esquentar();
        etapas.servir();
        System.out.println(etapas.toString());
        System.out.println();
    }
}
