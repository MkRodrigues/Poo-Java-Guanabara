package aula10;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

////        Construtor
//    public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
//        super(nome, idade, sexo);
//        this.especialidade = especialidade;
//        this.salario = salario;
//    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

//  Métodos
    public void receberAum() {

    }

}
