package aula12;

public class Aula12 {
    
    /*
    * Polimorfismo de Sobreposição: 
    * O polimorfismo de sobreposição se caracteriza pelo uso ÚNICO de um método em VÁRIAS/CADA classes, tendo esses métodos a mesma assinatura do método originado.
    * Exemplo de assinatura: Os métodos devem ser utilizados com a claúsula @Overrride e ter a mesma quantidade de parâmetros e os mesmos tipos. 
    */

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println(m.toString());
        System.out.println(m.getPeso());

    }

}
