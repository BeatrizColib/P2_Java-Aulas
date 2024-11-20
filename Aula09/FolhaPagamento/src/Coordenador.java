public class Coordenador extends Pessoa implements Folha{
    @Override
    public void responsabilidade(){
        System.out.println("Responsabilidade do coordenador: Coordenar cursos");
    }

    @Override
    public void calcularSalario(){
        System.out.println("O salário do coordenador é R$ ");
    }
}
