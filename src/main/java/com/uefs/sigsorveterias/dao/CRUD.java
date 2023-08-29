package com.uefs.sigsorveterias.dao;

import com.uefs.sigsorveterias.model.Cliente;

import java.util.List;

public interface CRUD<T> {

    public T create(T obj);

    public T delete(T obj);

    public T update(T obj);

    public List<T> read();

}
