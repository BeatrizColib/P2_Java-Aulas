package aula04;

public class Questao01 {

    private String nome01 = "José M. Oliveira";
    private int valor_hora = 15;
    private int quantidade_horas = 40;
    private int salario;

    public Questao01(){ //construtor
        calcularSalario();
    }

    private void calcularSalario(){  //método para calcular o salario - private
        this.salario = valor_hora * quantidade_horas;
    }

    //fazendo os get - os get é com public int/string e return abaixo
    public String getNome01(){
        return nome01;
    }
    public int getValor_hora(){
        return valor_hora;
    }
    public int getQuantidade_horas(){
        return quantidade_horas;
    }
    public int getSalario(){
        return salario;
    }

    //fazendo os set - os set eh com void e this.nomedavariavel abaixo
    public void setNome01(String nome01){
        this.nome01 = nome01;
    }
    public void setValor_hora(int valor_hora){
        this.valor_hora = valor_hora;
        calcularSalario(); //se mudar o valor da hora, recalcula o salario
    }
    public void setQuantidade_horas(int quantidade_horas){
        this.quantidade_horas = quantidade_horas;
        calcularSalario(); //se mudar a qnt de horas, recalcula o salario
    }
}
