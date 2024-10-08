public class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private double hora_valor;
    private double horas_trabalhadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //get
    public double getHora_valor() {
        return hora_valor;
    }

    public void setHora_valor(double hora_valor) {
        this.hora_valor = hora_valor;
    }

    public double getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    //set
    public void setHoras_trabalhadas(double horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public double calc() {     //ver esse PONTO
        salario = hora_valor * horas_trabalhadas;
        return salario;
    }
}

//se colocar p.cal() na main, aqui tem que ser com void.
//mas se tiver o uso do return, fica dentro do system out também