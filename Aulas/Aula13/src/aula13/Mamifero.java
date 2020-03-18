package aula13;

public class Mamifero extends Animal {
    
    protected String corPelo;

//    Métodos de Sobreposição
    @Override
    public void emitirSom() {
        System.out.println("Emitir Som");
        
    }
    
}
