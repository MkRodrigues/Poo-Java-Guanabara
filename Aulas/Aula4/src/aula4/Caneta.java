
package aula4;

public class Caneta {
    
    public Caneta(String m, String c, float p){
//        Construtor
        setModelo(m);
        setCor(c);
        setPonta(p);
        tampar();
    }
    
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
//    Métodos
    
    public void status(){
        System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada?: " + this.tampada);
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
       this.tampada = t;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
}


    