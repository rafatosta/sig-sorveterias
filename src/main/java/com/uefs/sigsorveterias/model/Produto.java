package com.uefs.sigsorveterias.model;

import com.uefs.sigsorveterias.dao.DAO;

public class Produto {

    /**
     * ID - Atributo identificador único
     */
    private int id;

    /**
     * Nome do produto
     */
    private String nome;

    /**
     * Preço
     */
    private Double preco;

    /**
     * Quantidade
     */
    private Integer quantidade;

    /**
     * Id do estoque ao qual o produto está relacionado
     */
    private int idEstoque;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, Double preco, Integer quantidade, Estoque estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.idEstoque = estoque.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque getEstoque() throws Exception {
        return DAO.getEstoqueDAO().findById(this.idEstoque);
    }

    public void setEstoque(Estoque estoque) {
        this.idEstoque = estoque.getId();
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}
