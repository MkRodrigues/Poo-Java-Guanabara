package aula11;

public abstract class Pessoa {
//    Classe abstrata não pode instanciar objetos, podendo somente ser progenitora
    
    private String nome;
    private int idade;
    private String sexo;
    
//    Getter and Setters

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    private void fazerAniversario(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "Dados {" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
