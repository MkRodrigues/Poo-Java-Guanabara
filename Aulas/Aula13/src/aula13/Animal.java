package aula13;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    
//    Getters and Setters

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
//    Métodos Abstratos
    public abstract void emitirSom();
    
    
}
