package com.uefs.sigsorveterias.dao.estoque;

import com.uefs.sigsorveterias.model.Estoque;

import java.util.ArrayList;
import java.util.List;

public class EstoqueDAOList implements EstoqueDAO {

    private List<Estoque> lista;

    private int proximoID;

    public EstoqueDAOList() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    /**
     * Retorna ID para o objeto atual e define o próximo ID
     *
     * @return
     */
    private int getProximoID() {
        /**
         * A++ -> usa o valor de A e depois incrementa A
         * ++A -> incrementa o valor de A e depois utiliza o valor de A
         */
        return this.proximoID++;
    }

    @Override
    public Estoque create(Estoque obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(Estoque obj) {
        this.lista.remove(obj);
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public Estoque update(Estoque obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<Estoque> findMany() {
        return this.lista;
    }

    @Override
    public Estoque findById(int id) {
        for (Estoque Estoque : this.lista) {
            if (Estoque.getId() == id) {
                return Estoque;
            }
        }
        return null;
    }
}
