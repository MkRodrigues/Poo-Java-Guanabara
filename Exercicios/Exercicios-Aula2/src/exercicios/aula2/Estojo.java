
package exercicios.aula2;

public class Estojo {
    String tamanho;
    String cor;
    boolean cheio;
    boolean aberto;
    
//    Métodos
    
    void status(){
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Cor: " + this.cor);
        System.out.println("O estojo está cheio?: " + this.cheio);
        System.out.println("O estojo está aberto?: " + this.aberto);
    }
    
    void guardarItens(){
        System.out.println("Guardando canetas e lápis");
    }
    
    void pegarCaneta(){
        System.out.println("Pegando uma caneta preta");
    }
    
    void abrirEstojo(){
        this.aberto = true;
    }
    
    void fecharEstojo(){
        this.aberto = false;
    }
    
    void verificarEstojo(){
        if (this.cheio == true){
            System.out.println("O estojo está cheio!");
        }else{
            System.out.println("O estojo está vazio!");
        }
    }
  
}
