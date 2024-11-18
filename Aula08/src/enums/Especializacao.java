package enums;

public enum Especializacao {
    CARDIOLOGISTA,
    DERMATOLOGISTA,
    PEDIATRA,
    OFTALMOLOGISTA,
    GINECOLOGISTA("GINECOLOGISTA E OBSTETRA");

    private final String descricao; //armazena a descrição do ("")

    Especializacao() {  //construtor
        this.descricao = this.name(); //Por padrão, a descrição será o nome do enum
    }

    Especializacao(String descricao){
        this.descricao = descricao; //inicializa com a descrição personalizada
    }

    public String getDescricao() {
        return descricao;
    }
}

/*
Geralmente, enum utiliza nomes constantes em UPPERCASE, mas você pode usar underscores (_)
ou combinações para criar valores mais descritivos.
 */