package com.uefs.sigsorveterias.model;

import com.uefs.sigsorveterias.dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    /**
     * ID - Atributo identificador único
     */
    private int id;
    /**
     * Breve descrição do tipo de produto que o estoque irá armazenar
     */
    private String descricao;

    /**
     * Nível minímo para alerta de produtos que precisam de reposição
     */
    private final int NIVEL_ALERTA = 5;

    /**
     * Descrição geral dos tipos de produtos que serão armazenados
     *
     * @param descricao
     */
    public Estoque(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    /**
     * Cria e armazena um novo produto no estoque
     *
     * @param novoProduto
     * @return
     */
    public Produto novoProduto(Produto novoProduto) {
        Produto produto = DAO.getProdutoDAO().create(novoProduto);
        return produto;
    }

    /**
     * Remove um produto do estoque
     *
     * @param produto
     */
    public void removeProduto(Produto produto) {
        DAO.getProdutoDAO().delete(produto);
    }

    /**
     * Atualiza um produto do estoque
     *
     * @param produto
     */
    public void updateProduto(Produto produto) {
        DAO.getProdutoDAO().update(produto);
    }

    /**
     * Retorna todos os produtos do estoque
     *
     * @return Lista de produtos
     */
    public List<Produto> getProdutos() {
        return DAO.getProdutoDAO().findMany();
    }

    /**
     * Busca um produto por seu ID
     *
     * @param idProduto
     * @return
     */
    public Produto getProduto(int idProduto) {
        return DAO.getProdutoDAO().findById(idProduto);
    }

    /**
     * Lista de produtos com quantidade abaixo do necessário
     *
     * @return
     */
    public List<Produto> getAlertaProdutos() {
        List<Produto> listaAlerta = new ArrayList<>();

        for (Produto produto : this.getProdutos()) {
            if (produto.getQuantidade() <= this.NIVEL_ALERTA) {
                listaAlerta.add(produto);
            }
        }
        return listaAlerta;
    }

    @Override
    public String toString() {
        return "Estoque{" + "estoque=" + getProdutos() + '}';
    }
}
