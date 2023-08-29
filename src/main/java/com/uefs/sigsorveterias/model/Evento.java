package com.uefs.sigsorveterias.model;

import java.util.Date;

public class Evento {

    private Cliente cliente;
    private Date data;

    public Evento(Cliente cliente, Date data) {
        this.cliente = cliente;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
