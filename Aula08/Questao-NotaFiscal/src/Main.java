import enums.CategoriaProduto;
import model.Cliente;
import model.NotaFiscal;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Bia Oliveira", "123.456.789-10");
        Produto produto1 = new Produto("Notebook", CategoriaProduto.ELETRONICO, 4500.0, 1);
        Produto produto2 = new Produto("Caderno", CategoriaProduto.PAPELARIA, 55.9, 3);
        Produto produto3 = new Produto("Poke", CategoriaProduto.ALIMENTO, 38.9, 2);
        NotaFiscal notaFiscal = new NotaFiscal();

        notaFiscal.adicionaCliente(cliente);
        notaFiscal.adicionaProduto1(produto1);
        notaFiscal.adicionaProduto2(produto2);
        notaFiscal.adicionaProduto3(produto3);

        System.out.println(notaFiscal);

    }
}