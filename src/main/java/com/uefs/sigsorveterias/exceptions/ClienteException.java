package com.uefs.sigsorveterias.exceptions;

import com.uefs.sigsorveterias.model.Cliente;

public class ClienteException extends Exception{
    private Cliente cliente;

    public ClienteException(String message, Cliente cliente) {
        super(message);
        this.cliente = cliente;
    }
}
