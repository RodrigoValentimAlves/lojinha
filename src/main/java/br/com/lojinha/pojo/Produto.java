package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private Tamanho tamanho;
    private List<String> itensInclusos;


    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        // Definir comandos que serão iniciados durante a instânciação
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novoMarca) {
        this.marca = novoMarca;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }


    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }
}

