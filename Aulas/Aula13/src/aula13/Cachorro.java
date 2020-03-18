package aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (frase == "Toma comida" || frase == "Olá") {
            System.out.println(frase);
            System.out.println("Abanar e Latir");
            
        } else {
            System.out.println(frase);
            System.out.println("Rosnar...");
        }
    }

    public void reagir(int hora, int minuto) {

        if (hora < 12) {
            System.out.println("Hora: " + hora + minuto);
            System.out.println("Abanar");

        } else if (hora >= 18) {
            System.out.println("Hora: " + hora + minuto);
            System.out.println("Ignorar...");

        } else {
            System.out.println("Abanar e latir...");
        }
    }

    public void reagir(boolean dono) {

        if (dono == true) {

            System.out.println("Abanar...");
        } else {

            System.out.println("Rosnar e latir...");
        }
    }

    public void reagir(int idade, float peso) {

        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar o rabo...");

            } else {
                System.out.println("Au! Au! Au!");

            }
        } else {

            if (peso < 10) {
                System.out.println("Rosnar...");

            } else {
                System.out.println("Ignorar...");

            }
        }
    }

}
