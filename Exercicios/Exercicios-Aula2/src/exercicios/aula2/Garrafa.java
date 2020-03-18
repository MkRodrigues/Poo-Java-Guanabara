/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula2;

/**
 *
 * @author mikae
 */
public class Garrafa {
    String tamanho;
    String cor;
    float expessura;
    int milimetragem;
    boolean aberto;
    
//    Métodos
    
    void status(){
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Cor: " + this.cor);
        System.out.println("Expessura: " + this.expessura);
        System.out.println("Milimetragem: " + this.milimetragem);
        System.out.println("A garrafa está aberta: " + this.aberto);
    }
    
    void abrirGarrafa(){
        this.aberto = true;
    }
    
    void fecharGarrafa(){
        this.aberto = false;
    }
    
    void encherGarrafa(){
        System.out.println("Enchendo a garrafa...");
    }
    
    void esvaziarGarrafa(){
        System.out.println("Esvaziando a garrafa...");
    }
    
    void derramarAgua(){
        System.out.println("Você esbarrou na garrafa e derramou a água...");
    }
    
    void beberAgua(){
        System.out.println("Bebendo água");
    }
    
}
