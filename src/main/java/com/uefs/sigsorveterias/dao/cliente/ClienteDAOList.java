package com.uefs.sigsorveterias.dao.cliente;

import com.uefs.sigsorveterias.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOList implements ClienteDAO {

    private List<Cliente> lista;

    public ClienteDAOList() {
        this.lista = new ArrayList<>();
    }

    @Override
    public Cliente create(Cliente obj) {
        this.lista.add(obj);
        return obj;
    }

    @Override
    public Cliente delete(Cliente obj) {
        return null;
    }

    @Override
    public Cliente update(Cliente obj) {
        return null;
    }

    @Override
    public List<Cliente> read() {
        return this.lista;
    }

    @Override
    public Cliente getCliente(int id) {
        return null;
    }
}
