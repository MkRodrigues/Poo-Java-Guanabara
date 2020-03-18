package aula9;

public class Aula9 {

    public static void main(String[] args) {
        
        
//        Instancia uma classe dentro de um Vetor
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
//        Instancia um objeto da Classe dentro de um determinado índice do Vetor
        p[0] = new Pessoa("Mikael Assis Silva", 26, "Masculino");
        p[1] = new Pessoa("Ruth Assis Pereira", 53, "Feminino");
        
        l[0] = new Livro("Mafalda", "Quino", 120, p[0]);
        l[1] = new Livro("Consiga o que você quer", "Stuart Diamond", 374, p[0]);
        l[2] = new Livro("Como cozinhar melhor", "Ana Maria Braga", 200, p[1]);
        
        l[0].abrir();
        l[0].folhear(150);
        System.out.println(l[0].detalhes());
        
        
    }
    
    
}
