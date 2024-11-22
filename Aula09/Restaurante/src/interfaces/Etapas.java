package interfaces;

public interface Etapas {
    public void preparar();
    public void temperar();
    public void esquentar();
    public void servir();

}


/*
numa interface, todos os métodos já têm implicítos o PUBLIC e o ABSTRACT.
por isso, pode-se escrever apenas "void nomeMetodo();"
o public so deixa mais claro p/ quem esta lendo o cod.
 */