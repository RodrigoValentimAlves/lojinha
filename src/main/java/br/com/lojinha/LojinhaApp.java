package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        System.out.println(meuProduto.getMarca());

        meuProduto.setNome("Play Station 5");
        meuProduto.setValor(20);
        meuProduto.setMarca("JL");

        List<ItemIncluso> ItensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        ItensInclusos.add(primeiroItemIncluso); //0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo",3);
        ItensInclusos.add(segundoItemIncluso); //1

        ItemIncluso terceitoItemIncluso = new ItemIncluso("Cabo de Energia", 2);
        ItensInclusos.add(terceitoItemIncluso); //2

        meuProduto.setItensInclusos(ItensInclusos);

//        System.out.println(meuProduto.getItensInclusos().get(1));
//        System.out.println(meuProduto.getTamanho());
//        System.out.println(meuProduto.getValor());
//        System.out.println(meuProduto.getMarca());
        /*
        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());
        */
        //Modo de fazer a impressão da lista com o for
        for(ItemIncluso itemAtual : meuProduto.getItensInclusos() ){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println("Acabou os itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.GRANDE);
        meuProdutoNacional.setImpostoNacional(0.5543);
        System.out.println("A taxa atual de Imposto Nacional é: " + meuProdutoNacional.getImpostoNacional());

        meuProdutoNacional.setValor(30);


        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.PEQUENO);
        meuProdutoInternacional.setTaxaImportação(1.556);
        System.out.println("A taxa atual de importação é: " + meuProdutoInternacional.getTaxaImportação());

        meuProdutoInternacional.setValor(-90);
    }
}
