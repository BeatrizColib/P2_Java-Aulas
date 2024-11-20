package model;

import enums.CategoriaProduto;

public class Produto implements Calculavel {
    private String nome;
    private CategoriaProduto categoria;
    private double precoProduto;
    private int quantidadeProduto;
    private double total;

    public Produto(String nome, CategoriaProduto categoria, double precoProduto, int quantidadeProduto){
        this.nome = nome;
        this.categoria = categoria;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.total = calcularTotal();
    }

    public double calcularTotal(){
        return quantidadeProduto * precoProduto;
    }

    @Override
    public double calcularImposto() {
        return total * 0.1;
    }

    @Override
    public double calcularJuros() {
        return total * 0.02;
    }

    @Override
    public double calcularLucro() {
        return total * 15;
    }

    @Override
    public double calcularDesconto() {
        return total * 0.05;
    }

    @Override
    public double calcularTaxaManuseio() {
        return 10;
    }

    @Override
    public double calcularPrecoFinal() {
        double imposto = calcularImposto();
        double juros = calcularJuros();
        double lucro = calcularLucro();
        double desconto = calcularDesconto();
        double taxaManuseio = calcularTaxaManuseio();

        return total + imposto + juros + lucro - desconto + taxaManuseio;
    }

    public String toString(){
        return "\n"+ nome + " | Categoria: " + categoria + " | Preço: R$ " + precoProduto +
                " | Quantidade: " + quantidadeProduto + " | Total: R$ " + String.format("%.2f", total) +
                "\nImposto: R$ " + String.format("%.2f",calcularImposto()) + " | Juros: R$ " + String.format("%.2f", calcularJuros()) +
                " | Lucro: R$ " + String.format("%.2f", calcularLucro()) + " | Desconto: R$ " + String.format("%.2f", calcularDesconto()) +
                " | Taxa de Manuseio: R$ " + calcularTaxaManuseio() + "\nPreço final: R$ " + String.format("%.2f", calcularPrecoFinal()) +
                "\n";
    }


}
