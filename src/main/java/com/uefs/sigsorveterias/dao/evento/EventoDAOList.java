package com.uefs.sigsorveterias.dao.evento;

import com.uefs.sigsorveterias.model.Evento;

import java.util.ArrayList;
import java.util.List;

public class EventoDAOList implements EventoDAO {

    private List<Evento> lista;

    private int proximoID;

    public EventoDAOList() {
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
    public Evento create(Evento obj) {
        obj.setId(this.getProximoID());
        this.lista.add(obj);
        return obj;
    }

    @Override
    public void delete(Evento obj) {
        this.lista.remove(obj);
    }

    @Override
    public void deleteMany() {
        this.lista = new ArrayList<>();
        this.proximoID = 0;
    }

    @Override
    public Evento update(Evento obj) {
        int index = this.lista.indexOf(obj);
        this.lista.set(index, obj);
        return obj;
    }

    @Override
    public List<Evento> findMany() {
        return this.lista;
    }

    @Override
    public Evento findById(int id) {
        for (Evento Evento : this.lista) {
            if (Evento.getId() == id) {
                return Evento;
            }
        }
        return null;
    }

}
