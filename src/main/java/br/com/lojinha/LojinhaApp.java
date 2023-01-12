package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        System.out.println(meuProduto.getMarca());

        meuProduto.setNome("Play Station 5");
        meuProduto.setValor(20);
        meuProduto.setMarca("JL");

        List<String> ItensInclusos = new ArrayList<String>();
        ItensInclusos.add("2 Controles");
        ItensInclusos.add("3 Jogos");
        ItensInclusos.add("2 cabos de vídeo");
        meuProduto.setItensInclusos(ItensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
    }
}
