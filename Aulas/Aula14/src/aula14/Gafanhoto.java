package aula14;

public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        
        this.login = login;
        this.totAssistido = 0;
    }
    
//    Getters and Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
//    Métodos
    @Override
    protected void ganharExp() {
        
    }

//    A tag super.toString() chama a toString() declarada na classe mãe dessa subclasse, printando na tela os dados implementados na classe Super
    @Override
    public String toString() {
        return "Ganhafoto {" + super.toString() + " login = " + login + ", totAssistido = " + totAssistido + '}';
    }
    
    
    
}
