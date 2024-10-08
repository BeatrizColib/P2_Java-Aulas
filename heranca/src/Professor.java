public class Professor extends Pessoa {
    private double salario;
    private int horas_ministradas;
    private double valor_hora;

    public void calcularSalario(){
        salario = horas_ministradas * valor_hora;
    }
    //set
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setHoras_ministradas(int horas_ministradas){
        this.horas_ministradas = horas_ministradas;
    }
    public void setValor_hora(double valor_hora){
        this.valor_hora = valor_hora;
    }
    //get
    public double getSalario(){
        return salario;
    }
    public double getHoras_ministradas(){
        return horas_ministradas;
    }
    public double getValor_hora(){
        return valor_hora;
    }
}
