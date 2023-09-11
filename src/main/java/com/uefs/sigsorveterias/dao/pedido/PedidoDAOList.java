package com.uefs.sigsorveterias.dao.pedido;

import com.uefs.sigsorveterias.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAOList implements PedidoDAO {

    private List<Pedido> lista;

    private int proximoID;

    public PedidoDAOList() {
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
    public Pedido create(Pedido obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(Pedido obj) {
        this.lista.remove(obj);
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public Pedido update(Pedido obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<Pedido> findMany() {
        return this.lista;
    }

    @Override
    public Pedido findById(int id) {
        for (Pedido Pedido : this.lista) {
            if (Pedido.getId() == id) {
                return Pedido;
            }
        }
        return null;
    }

}
