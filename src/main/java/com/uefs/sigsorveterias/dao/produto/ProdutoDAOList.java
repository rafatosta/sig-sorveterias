package com.uefs.sigsorveterias.dao.produto;

import com.uefs.sigsorveterias.model.Estoque;
import com.uefs.sigsorveterias.model.Produto;

import java.util.List;

public class ProdutoDAOList implements ProdutoDAO{

    @Override
    public Produto create(Produto obj) {
        return null;
    }

    @Override
    public void delete(Produto obj) {

    }

    @Override
    public void deleteMany() {

    }

    @Override
    public Produto update(Produto obj) {
        return null;
    }

    @Override
    public List<Produto> findMany() {
        return null;
    }

    @Override
    public Produto findById(int id) {
        return null;
    }

    @Override
    public List<Produto> findManyByEstoque(Estoque estoque) {
        return null;
    }

    @Override
    public Produto findById(int idProduto, Estoque estoque) {
        return null;
    }

    @Override
    public void deleteMany(Estoque estoque) {

    }
}
