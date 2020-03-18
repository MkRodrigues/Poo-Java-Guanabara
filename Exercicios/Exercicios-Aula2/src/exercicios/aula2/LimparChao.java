
package exercicios.aula2;

public class LimparChao {
    String itemLimpar;
    String itemSecar;
    String produtoUsado;
    boolean limpo;
    boolean seco;
    
//    Métodos
    
    void usarProduto(){
        System.out.println("O produto usado para limpar o chão foi " + this.produtoUsado);
    }
    
    void limparChao(){
        if(this.limpo == true){
            System.out.println("O chão foi limpo usando " + this.itemLimpar);
        }else{
            System.out.println("O chão está sujo!");
        }
    }
    
    void secarChao(){
        if(this.seco == true){
            System.out.println("o chão foi seco usando " + this.itemSecar);
        }else{
            System.out.println("O chão está molhado, não escorregue!");
        }
    }
    
}
