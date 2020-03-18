package aula10;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

////        Construtor
//    public Aluno(int matricula, String curso, String nome, int idade, String sexo) {
//        super(nome, idade, sexo);
//        this.matricula = matricula;
//        this.curso = curso;
//    }

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
    public void cancelarMat() {
        System.out.println("Matrícula será cancelada!");
    }

}
