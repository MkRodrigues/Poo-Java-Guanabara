package aula11;

public class Aula11 {

    public static void main(String[] args) {

//        Pessoa p1 = new Pessoa(); - Gera erro dizendo que Pessoa é uma classe Abstrata e portanto não pode ser instanciada.

        Visitante v1 = new Visitante();
        v1.setNome("Pedro Amaral");
        v1.setIdade(22);
        v1.setSexo("masculino");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Manuel Pereira");
        a1.setIdade(20);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Mikael Assis Silva");
        b1.setIdade(26);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
        
        
        
        

    }

}
