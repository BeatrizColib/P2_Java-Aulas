import enums.*;
import interfaces.Etapas;
import models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //objetos com polimorfismo
        Etapas entrada = new Entrada("salada", TipoRefeicao.VEGANA, "serve 2 pessoas", 65.00);
        Etapas pratoPrincipal = new PratoPrincipal("Raviolli", TipoRefeicao.GLUTENFREE, "serve 1 pessoa", 59.00);
        Etapas sobremesa = new Sobremesa("Crumble de maça", TipoRefeicao.TRADICIONAL, "serve 2 pessoas", 36.00);

        //gerenciamento
        GerenciadorRefeicoes ger = new GerenciadorRefeicoes();
        ger.gerenciarRefeicao(entrada);
        ger.gerenciarRefeicao(pratoPrincipal);
        ger.gerenciarRefeicao(sobremesa);
    }
}