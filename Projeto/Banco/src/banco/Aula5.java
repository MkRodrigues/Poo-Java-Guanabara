/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author mikael
 */
public class Aula5 {

    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco(1014, "CC", "Mikael Assis Silva");
        pessoa1.depositar(100);
        pessoa1.statusConta();
        pessoa1.sacar(70);
        pessoa1.pagarMensalidade();
        pessoa1.fecharConta();
        pessoa1.sacar(68); 
        pessoa1.fecharConta();
        pessoa1.statusConta();

//        ContaBanco pessoa2 = new ContaBanco(1015, "PP", "Ruth Assis Pereira");
//        pessoa2.depositar(500);
//        pessoa2.statusConta();
    }

}
