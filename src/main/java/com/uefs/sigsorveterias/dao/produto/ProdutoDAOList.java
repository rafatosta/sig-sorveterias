package com.uefs.sigsorveterias.dao.produto;

import com.uefs.sigsorveterias.model.Produto;
import com.uefs.sigsorveterias.model.Estoque;
import com.uefs.sigsorveterias.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOList implements ProdutoDAO {

    private List<Produto> lista;

    private int proximoID;

    public ProdutoDAOList() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    /**
     * Retorna ID para o objeto atual e define o próximo ID
     *
     * @return
     */
    private int getProximoID() {
        return this.proximoID++;
    }

    @Override
    public Produto create(Produto obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(Produto obj) {
        this.lista.remove(obj);
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public Produto update(Produto obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<Produto> findMany() {
        return this.lista;
    }

    @Override
    public Produto findById(int id) {
        for (Produto Produto : this.lista) {
            if (Produto.getId() == id) {
                return Produto;
            }
        }
        return null;
    }

    @Override
    public List<Produto> findManyByEstoque(Estoque estoque) {
        List<Produto> pEstoque = new ArrayList<>();
        for (Produto p : this.lista) {
            if (p.getEstoque().equals(estoque)) {
                pEstoque.add(p);
            }
        }
        return pEstoque;
    }

    @Override
    public Produto findById(int idProduto, Estoque estoque) {
        for (Produto p : this.lista) {
            if (p.getId() == idProduto && p.getEstoque().equals(estoque)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void deleteMany(Estoque estoque) {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }
}
