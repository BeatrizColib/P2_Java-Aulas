package models;

import enums.TipoRefeicao;

public abstract class Refeicao {
    //atributos
    protected String nomePrato;
    protected double precoPrato;
    protected String tamanhoPorcao; //individual, serve duas, três pessoas...

    //construtor
    public Refeicao() {
    }

    public Refeicao(String nomePrato, String tamanhoPorcao,  double precoPrato) {
        this.nomePrato = nomePrato;
        this.tamanhoPorcao = tamanhoPorcao;
        this.precoPrato = precoPrato;
    }
    //obs: como nao coloquei um atributo acima "private TipoRefeicao tipoRefeicao; -> Atributo da classe"
    //nao preciso colocar o "this.tipoRefeicao = tipoRefeicao;"
    // Uso de `this` para diferenciar o atributo do parâmetro

    //getters e setters
    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPrecoPrato() {
        return precoPrato;
    }

    public void setPrecoPrato(double precoPrato) {
        this.precoPrato = precoPrato;
    }

    public String getTamanhoPorcao() {
        return tamanhoPorcao;
    }

    public void setTamanhoPorcao(String tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }

    //toString
    @Override
    public String toString() {
        return nomePrato + " | Porção: " + tamanhoPorcao + " | Preço: R$ " + precoPrato;
    }
}
