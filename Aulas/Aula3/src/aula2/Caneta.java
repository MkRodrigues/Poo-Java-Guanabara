
package aula2;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
//    Métodos
    
    public void status(){
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }
    
    public void rabiscar(){
           if(this.tampada == true){
               System.out.println("Destampe para Rabiscar!");
           
           }else{
               System.out.println("Rabiscando...");
           }
    }
    
    private void tampar(){
        this.tampada = true;
        
    }
    
    void destampar(){
        this.tampada = false;
        
    }
    
}
