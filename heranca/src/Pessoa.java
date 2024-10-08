public class Pessoa {
    protected String nome;
    protected int idade;
    protected int matricula;
    protected String cpf, rg, tel;

    public  Pessoa(){
        //construtor
    }

    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    //método
    public void aniversario(){
        idade++;
    }
}
