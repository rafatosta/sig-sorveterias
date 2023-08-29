package com.uefs.sigsorveterias.dao;

import com.uefs.sigsorveterias.dao.cliente.ClienteDAO;
import com.uefs.sigsorveterias.dao.cliente.ClienteDAOList;
import com.uefs.sigsorveterias.dao.funcionario.FuncionarioDAO;
import com.uefs.sigsorveterias.dao.funcionario.FuncionarioDAOList;
import com.uefs.sigsorveterias.dao.produto.ProdutoDAO;
import com.uefs.sigsorveterias.dao.produto.ProdutoDAOList;

public class DAO {

    private static ClienteDAO clienteDAO;
    private static FuncionarioDAO funcionarioDAO;

    private static ProdutoDAO produtoDAO;

    public static ClienteDAO getClienteDAO() {
        if (clienteDAO == null) {
            clienteDAO = new ClienteDAOList();
        }
        return clienteDAO;
    }

    public static FuncionarioDAO getFuncionarioDAO() {
        if (funcionarioDAO == null) {
            funcionarioDAO = new FuncionarioDAOList();
        }
        return funcionarioDAO;
    }

    public static ProdutoDAO getProdutoDAO() {
        if (produtoDAO == null) {
            produtoDAO = new ProdutoDAOList();
        }
        return produtoDAO;
    }
}
