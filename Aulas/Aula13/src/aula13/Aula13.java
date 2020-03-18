
package aula13;

/*
* Polimorfismo de Sobrecarga - o Polimorfismo de Sobrecarga se caracteriza pelo uso de vários métodos com o MESMO NOME dentro da mesma classe, tendo 
* cada método uma ASSINATURA DIFERENTE. 
*/

public class Aula13 {
    
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
    
}
