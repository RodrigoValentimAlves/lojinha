package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.terfaces.Favorito;


public class ProdutoInternacional extends Produto implements Favorito {
    private double taxaImportação;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que -100");
        }
    }

    public double getTaxaImportação(){
        return this.taxaImportação;
    }
    public void setTaxaImportação(double novaTaxaImportação){
        this.taxaImportação = novaTaxaImportação;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
