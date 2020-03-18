package aula14;

public class Aula14 {

    public static void main(String[] args) {

//        Instanciando uma classe de Video, sendo este objeto "v[]" um vetor de 3 objetos.
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vs[] = new Visualizacao[4];

//        Pegando o índice desse vetor e instaciando um novo objeto com construtor
        v[0] = new Video("POO Aula 1 - Introdução à Programação Orientada à Objetos");
        v[1] = new Video("POO Aula 2 - Configurando o ambiente JAVA");
        v[2] = new Video("POO Aula 3 - Primeiro projeto em Netbeans");

        g[0] = new Gafanhoto("Mikael Assis Silva", 26, "Masculino", "MkRodrigues");
        g[1] = new Gafanhoto("Maria das Dores", 55, "Feminino", "MariaDores");

        vs[0] = new Visualizacao(g[0], v[0]);
        vs[0] = new Visualizacao(g[0], v[1]);

        System.out.println(vs[0].toString());
        v[0].setReproduzindo(true);
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());

    }

}
