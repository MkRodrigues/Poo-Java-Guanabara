package aula12;

public class Peixe extends Animal{
    
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
//    Métodos
    @Override
    public void locomover() {
        System.out.println("Nadando...");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias...");

    }

    @Override
    public void emitirSom() {
        System.out.println("Peixes não emitem som!");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }
}
