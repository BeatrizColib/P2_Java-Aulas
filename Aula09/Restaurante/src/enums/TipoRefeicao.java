package enums;

public enum TipoRefeicao{
    VEGANA,
    GLUTENFREE("GLUTEN FREE"),
    TRADICIONAL;
    // sao separados por virgula, apenas o ultimo que termina em ;

    private final String descricao;

    TipoRefeicao(){this.descricao = this.name();}  //construtor padrão - caso nao tenha nenhum personalizado, nao precisa cria-lo, estará implicito
    TipoRefeicao(String descricao){this.descricao = descricao;} //construtor sobrecarregado- aceita uma descrição personalizada com o nome do atrib. que eu criei - no caso "descricao"
    public String getDescricao(){return descricao;} //precisa-se do get para pode pegar/acessar esse atributo criado
}

// método name() como valor padrão.
/*
nas classes, deve-se criar um atributo do tipo do enum.
ele armazena uma das constantes definidas no enum (VEGANA, GLUTENFREE, ou TRADICIONAL) como uma propriedade da classe.
O enum é usado para representar valores fixos, então a classe pode associar o tipo de refeição à entrada específica.
ex.: nas classes filhas, crio o atrib "private TipoRefeicao tipoRefeicao;" - crio um atrib. da class enum para receber seus valores
 */