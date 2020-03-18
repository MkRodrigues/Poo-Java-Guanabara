package aula11;

public class Aluno extends Pessoa {
//    Esta é uma classe de Herança para Diferença, pois a mesma herda os atributos da Classe mãe/progenitora/super classe ,
//    e possui seus próprios atributos e métodos
    
    private int matricula;
    private String curso;
    
//    Getters and Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
//    Métodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do Aluno: " + this.getNome());
    }
}
