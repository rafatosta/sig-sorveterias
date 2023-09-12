package com.uefs.sigsorveterias.exceptions;

import com.uefs.sigsorveterias.model.Cliente;

public class ClienteException extends Exception{

    /** Mensagens estáticas para as exceções*/
    public static final String DELETE = "Operação de EXCLUSÃO não realizada.";
    public static final String UPDATE = "Operação de ATUALIZAÇÃO não realizada.";
    private Cliente cliente;

    public ClienteException(String message, Cliente cliente) {
        super(message);
        this.cliente = cliente;
    }
}
