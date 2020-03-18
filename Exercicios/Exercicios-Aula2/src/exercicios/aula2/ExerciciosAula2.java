/*
* Criar dois objetos físicos e dois objetos conceituais
 */
package exercicios.aula2;

public class ExerciciosAula2 {

    public static void main(String[] args) {

//        Garrafa
//        Garrafa g1 = new Garrafa();
//        g1.tamanho = "Média";
//        g1.cor = "Preto";
//        g1.expessura = 60.0f;
//        g1.milimetragem = 600;
//        g1.abrirGarrafa();
//
//        g1.status();
//        g1.encherGarrafa();
//        g1.beberAgua();
//      ---------------------------------*----------------------------
//      Estojo
//        Estojo e1 = new Estojo();
//        e1.tamanho = "Médio";
//        e1.cor = "Verde Musgo";
//        e1.cheio = false;
//        e1.aberto = true;
//
//        e1.abrirEstojo();
//        e1.status();
//        e1.pegarCaneta();
//        e1.guardarItens();
//        e1.fecharEstojo();
//        e1.verificarEstojo();
//    
//      ---------------------------------*----------------------------
//      LimparXIxi
        LimparChao limpar = new LimparChao();

        limpar.itemLimpar = "Vassoura";
        limpar.itemSecar = "Pano";
        limpar.produtoUsado = "Veja";
        limpar.limpo = true;
        limpar.seco = true;

        limpar.limparChao();
        limpar.usarProduto();
        limpar.secarChao();

    }
}
