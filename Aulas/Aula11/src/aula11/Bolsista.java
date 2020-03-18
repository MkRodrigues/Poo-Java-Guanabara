package aula11;

public class Bolsista extends Aluno {
//    Herança para Diferença
    
    private String bolsa;
    
//    Getters and Setters

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
    
//    Métodos
    @Override
//    Um método que possui a característica Override, diz que este método é herdado de uma outra classe,
// porém que possui características diferentes do originado pela classe mãe
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista, portanto seu pagamento é facilitado!");
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno: " + this.getNome());
    }
    
    
}
