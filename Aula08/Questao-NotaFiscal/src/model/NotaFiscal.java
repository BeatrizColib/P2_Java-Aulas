package model;

public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public NotaFiscal(){}

    public void adicionaCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void adicionaProduto1(Produto produto){
        this.produto1 = produto;
    }
    public void adicionaProduto2(Produto produto){
        this.produto2 = produto;
    }
    public void adicionaProduto3(Produto produto){
        this.produto3 = produto;
    }

    @Override
    public String toString() {
        return "------------------NotaFiscal-----------" +
                "\n->Cliente: " + cliente +
                "\n-Produto 1: " + produto1 +
                "\n-Produto 2: " + produto2 +
                "\n-Produto 3: " + produto3 +
                "\n-------------------------------------";
    }
}
