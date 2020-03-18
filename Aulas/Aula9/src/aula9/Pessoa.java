package aula9;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
//        Construtor
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

//    Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

//    Métodos
    public void fazerAniversario() {
        this.idade++;

    }
}
