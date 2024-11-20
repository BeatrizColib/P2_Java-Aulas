public class Professor extends Pessoa implements Folha{
    @Override
    public void responsabilidade(){
        System.out.println("Responsabilidade do professor: Ensinar, ministrar aulas");
    }

    @Override
    public void calcularSalario(){
        System.out.println("Salário do professor é R$");
    }
}
