package com.uefs.sigsorveterias.model;

import com.uefs.sigsorveterias.dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    public Estoque() {

    }

    /**
     * Cria e armazena um novo produto no estoque
     *
     * @param nome       Nome do produto
     * @param preco
     * @param quantidade
     * @return Novo produto
     */
    public Produto novoProduto(Produto novoProduto) {
        Produto produto = DAO.getProdutoDAO().create(novoProduto);
        return produto;
    }

    public void removeProduto(Produto produto) {
        DAO.getProdutoDAO().delete(produto);
    }

    public List<Produto> getProdutos() {
        return DAO.getProdutoDAO().read();
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

    public static void main(String[] args) {
        Estoque e = new Estoque();

        Produto picolé = e.novoProduto(new Produto("Picolé", 10.50, 20));
        e.novoProduto(new Produto("Picolé 2", 10.50, 20));
        e.novoProduto(new Produto("Picolé 3", 10.50, 20));
        e.novoProduto(new Produto("Picolé 4", 10.50, 20));
        System.out.println(e);


    }


}
