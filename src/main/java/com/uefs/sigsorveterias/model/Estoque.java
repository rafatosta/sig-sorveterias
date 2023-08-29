package com.uefs.sigsorveterias.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> estoque;

    public Estoque() {
        this.estoque = new ArrayList();
    }

    /**
     * Cria e armazena um novo produto no estoque
     * Qual o problema de implementar a composição dessa forma?
     *
     * @param nome       Nome do produto
     * @param preco
     * @param quantidade
     * @return Novo produto
     */
    public Produto novoProduto(String nome, Double preco, Integer quantidade) {
        return new Produto(nome, preco, quantidade);
    }

    public List<Produto> getProdutos() {
        return this.estoque;
    }

    public Produto getProduto() {
        // Como buscar um produto?
        return null;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "estoque=" + estoque +
                '}';
    }
}
