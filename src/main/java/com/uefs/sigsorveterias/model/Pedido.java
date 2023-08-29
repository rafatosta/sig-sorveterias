package com.uefs.sigsorveterias.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itemPedidoList;

    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itemPedidoList = new ArrayList();
    }

    public void addItem(ItemPedido item) {
        this.itemPedidoList.add(item);
    }

    public void removerItem(ItemPedido item) {
        this.itemPedidoList.remove(item);
    }

    public Double getValorTotal() {
        double vt = 0;
        for (ItemPedido item : this.itemPedidoList) {
            vt += item.getValorTotal();
        }
        return vt;
    }

    @Override
    public String toString() {
        return "Pedido{\n" +
                "\t itemPedidoList: " + itemPedidoList +
                "\n\t valor total: R$" + this.getValorTotal() +
                ",\n\t cliente: " + cliente +
                "\n}";
    }
}
