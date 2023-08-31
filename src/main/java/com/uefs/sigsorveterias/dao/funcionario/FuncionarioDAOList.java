package com.uefs.sigsorveterias.dao.funcionario;

import com.uefs.sigsorveterias.model.Funcionario;
import com.uefs.sigsorveterias.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOList implements FuncionarioDAO{

    private List<Funcionario> lista;

    private int proximoID;

    public FuncionarioDAOList() {
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
    public Funcionario create(Funcionario obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(Funcionario obj) {
        this.lista.remove(obj);
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public Funcionario update(Funcionario obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<Funcionario> findMany() {
        return this.lista;
    }

    @Override
    public Funcionario findById(int id) {
        for (Funcionario Funcionario : this.lista) {
            if (Funcionario.getId() == id) {
                return Funcionario;
            }
        }
        return null;
    }
}
