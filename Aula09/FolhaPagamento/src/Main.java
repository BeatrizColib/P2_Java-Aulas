public class Main {
    public static void main(String[] args) {
        Pessoa prof = new Professor();     //polimorfismo
        Pessoa coord = new Coordenador();

        TransformacaoPolimorfica trans = new TransformacaoPolimorfica();  //aqui esta o metodo de calcular salario
        prof.responsabilidade(); //chamei o metodo da classe pai - que irá exibir pelo override da classe filha Professor
        trans.polimorfismo_interface((Folha) prof);
        System.out.println();
        coord.responsabilidade();
        trans.polimorfismo_interface((Folha) coord);

    }
}