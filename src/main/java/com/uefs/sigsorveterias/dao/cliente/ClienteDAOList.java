package com.uefs.sigsorveterias.dao.cliente;

import com.uefs.sigsorveterias.dao.DAO;
import com.uefs.sigsorveterias.exceptions.ClienteException;
import com.uefs.sigsorveterias.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOList implements ClienteDAO {

    private List<Cliente> lista;

    private int proximoID;

    public ClienteDAOList() {
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
    public Cliente create(Cliente obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(Cliente obj) throws ClienteException {
        boolean remove = this.lista.remove(obj);
        if (!remove) {
            throw new ClienteException(ClienteException.DELETE, obj);
        }
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public Cliente update(Cliente obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<Cliente> findMany() {
        return this.lista;
    }

    @Override
    public Cliente findById(int id) {
        for (Cliente cliente : this.lista) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

}
