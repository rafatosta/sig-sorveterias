package com.uefs.sigsorveterias.dao.venda;

import com.uefs.sigsorveterias.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class VendaDAOList implements VendaDAO {

    private List<Venda> lista;

    private int proximoID;

    public VendaDAOList() {
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
    public Venda create(Venda obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(Venda obj) {
        this.lista.remove(obj);
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public Venda update(Venda obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<Venda> findMany() {
        return this.lista;
    }

    @Override
    public Venda findById(int id) {
        for (Venda Venda : this.lista) {
            if (Venda.getId() == id) {
                return Venda;
            }
        }
        return null;
    }

}
