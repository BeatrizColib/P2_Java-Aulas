public class Aluno extends Pessoa {
    private double nota_01;
    private double nota_02;
    private double nota_03;
    private double media;
    private String situacao;

    public Aluno() {

    }
    /*public Aluno(String nome, int matricula, double nota_01, double nota_02, double nota_03, double media, String situacao) {
        super(nome, matricula);
        this.nota_01 = nota_01;
        this.nota_02 = nota_02;
        this.nota_03 = nota_03;
        this.media = media;
        this.situacao = situacao;
    }*/

    public void calcularMedia(){
        media = (nota_01 + nota_02 + nota_03) / 3;
    }
    public void verificarSituacao(){
        if (media >= 70) {
            situacao = "APROVADO/A";
        } else if (media >= 40 && media <70) {
            situacao = "EM RECUPERAÇÃO";
        } else {
            situacao = "REPROVADO/A";
        }
    }

    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setNota_01(double nota_01){
        this.nota_01 = nota_01;
    }
    public void setNota_02(double nota_02){
        this.nota_02 = nota_02;
    }
    public void setNota_03(double nota_03){
        this.nota_03 = nota_03;
    }
    public void setMedia(double media){
        this.media = media;
    }

    //get
    public int getMatricula(){
        return matricula;
    }
    public double getNota_01(){
        return nota_01;
    }
    public double getNota_02(){
        return nota_02;
    }
    public double getNota_03(){
        return nota_03;
    }
    public double getMedia(){
        return media;
    }

}
