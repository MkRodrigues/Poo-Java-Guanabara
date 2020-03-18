package aula7_aula8;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {
//        Construtor
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

//    Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {

            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);

        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("----- Desafiado -----");
            this.getDesafiado().aprensentar();

            System.out.println("----- Desafiante -----");
            this.getDesafiante().aprensentar();
            
//            Importa o pacote e instancia o uso do pacote de números aleatórios
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===== RESULTADO DA LUTA =====");
            switch(vencedor){
                case 0: 
//                    Empate
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
//                    Desafiado ganha
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                   this.getDesafiado().ganharLuta();
                   this.getDesafiante().perderLuta();
                   break;
                case 2:
//                    Desafiante ganha
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
            System.out.println("==============================");
        } else {
            System.out.println("LUTA NÃO APROVADA!");
        }

    }

}
