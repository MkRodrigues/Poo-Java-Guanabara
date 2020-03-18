package aula11;

public class Professor extends Pessoa {
//Herança para Diferença

    private String especialidade;
    private float salario;
    
//    Getters and Setters

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
    
//    Métodos
    public void receberAumento(){
        
    }
    
}
