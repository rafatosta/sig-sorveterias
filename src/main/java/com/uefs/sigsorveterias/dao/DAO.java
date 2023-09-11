package com.uefs.sigsorveterias.dao;

import com.uefs.sigsorveterias.dao.cliente.ClienteDAO;
import com.uefs.sigsorveterias.dao.cliente.ClienteDAOList;
import com.uefs.sigsorveterias.dao.estoque.EstoqueDAO;
import com.uefs.sigsorveterias.dao.estoque.EstoqueDAOList;
import com.uefs.sigsorveterias.dao.evento.EventoDAO;
import com.uefs.sigsorveterias.dao.evento.EventoDAOList;
import com.uefs.sigsorveterias.dao.funcionario.FuncionarioDAO;
import com.uefs.sigsorveterias.dao.funcionario.FuncionarioDAOList;
import com.uefs.sigsorveterias.dao.item_pedido.ItemPedidoDAO;
import com.uefs.sigsorveterias.dao.item_pedido.ItemPedidoDAOList;
import com.uefs.sigsorveterias.dao.pedido.PedidoDAO;
import com.uefs.sigsorveterias.dao.pedido.PedidoDAOList;
import com.uefs.sigsorveterias.dao.produto.ProdutoDAO;
import com.uefs.sigsorveterias.dao.produto.ProdutoDAOList;
import com.uefs.sigsorveterias.dao.venda.VendaDAO;
import com.uefs.sigsorveterias.dao.venda.VendaDAOList;

public class DAO {

    private static ClienteDAO clienteDAO;
    private static EstoqueDAO estoqueDAO;
    private static EventoDAO eventoDAO;
    private static FuncionarioDAO funcionarioDAO;
    private static ItemPedidoDAO itemPedidoDAO;
    private static PedidoDAO pedidoDAO;
    private static ProdutoDAO produtoDAO;
    private static VendaDAO vendaDAO;

    public static ClienteDAO getClienteDAO() {
        if (clienteDAO == null) {
            clienteDAO = new ClienteDAOList();
        }
        return clienteDAO;
    }

    public static EstoqueDAO getEstoqueDAO() {
        if (estoqueDAO == null) {
            estoqueDAO = new EstoqueDAOList();
        }
        return estoqueDAO;
    }

    public static EventoDAO getEventoDAO() {
        if (eventoDAO == null) {
            eventoDAO = new EventoDAOList();
        }
        return eventoDAO;
    }

    public static FuncionarioDAO getFuncionarioDAO() {
        if (funcionarioDAO == null) {
            funcionarioDAO = new FuncionarioDAOList();
        }
        return funcionarioDAO;
    }

    public static ItemPedidoDAO getItemPedidoDAO() {
        if (itemPedidoDAO == null) {
            itemPedidoDAO = new ItemPedidoDAOList();
        }
        return itemPedidoDAO;
    }

    public static PedidoDAO getPedidoDAO() {
        if (pedidoDAO == null) {
            pedidoDAO = new PedidoDAOList();
        }
        return pedidoDAO;
    }

    public static ProdutoDAO getProdutoDAO() {
        if (produtoDAO == null) {
            produtoDAO = new ProdutoDAOList();
        }
        return produtoDAO;
    }

    public static VendaDAO getVendaDAO() {
        if (vendaDAO == null) {
            vendaDAO = new VendaDAOList();
        }
        return vendaDAO;
    }
}
