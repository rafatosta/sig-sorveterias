package com.uefs.sigsorveterias.dao.item_pedido;

import com.uefs.sigsorveterias.model.ItemPedido;
import com.uefs.sigsorveterias.model.Pedido;
import com.uefs.sigsorveterias.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ItemPedidoDAOList implements ItemPedidoDAO {

    private List<ItemPedido> lista;

    private int proximoID;

    public ItemPedidoDAOList() {
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
    public ItemPedido create(ItemPedido obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(ItemPedido obj) {
        this.lista.remove(obj);
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public ItemPedido update(ItemPedido obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<ItemPedido> findMany() {
        return this.lista;
    }

    @Override
    public ItemPedido findById(int id) {
        for (ItemPedido ItemPedido : this.lista) {
            if (ItemPedido.getId() == id) {
                return ItemPedido;
            }
        }
        return null;
    }

    @Override
    public List<ItemPedido> findManyByPedido(Pedido pedido) {
        List<ItemPedido> itens = new ArrayList<>();
        for (ItemPedido i : this.lista) {
            if (i.getProduto().equals(pedido)) {
                itens.add(i);
            }
        }
        return itens;
    }

    @Override
    public void deleteMany(Pedido pedido) {
        for (ItemPedido i : this.lista) {
            if (i.getProduto().equals(pedido)) {
                this.lista.remove(i);
            }
        }
    }
}
