package com.uefs.sigsorveterias.dao.produto;

import com.uefs.sigsorveterias.dao.CRUD;
import com.uefs.sigsorveterias.model.Estoque;
import com.uefs.sigsorveterias.model.Produto;

import java.util.List;

public interface ProdutoDAO extends CRUD<Produto> {

    /**
     * Retorna todos os produtos de estoque específico
     *
     * @param estoque
     * @return
     */
    public List<Produto> findManyByEstoque(Estoque estoque);

    /**
     * Retorna um produto de um estoque específico
     *
     * @param idProduto
     * @param estoque
     * @return
     */
    public Produto findById(int idProduto, Estoque estoque);


    /**
     * Remove todos os produtos de um estoque
     *
     * @param estoque
     */
    public void deleteMany(Estoque estoque);
}
