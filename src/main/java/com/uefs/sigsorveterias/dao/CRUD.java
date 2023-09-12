package com.uefs.sigsorveterias.dao;

import com.uefs.sigsorveterias.model.Cliente;

import java.util.List;

public interface CRUD<T, E extends Exception> {

    /**
     * Cria novo objeto
     *
     * @param obj
     * @return
     */
    public T create(T obj);

    /**
     * Deleta um objeto
     *
     * @param obj
     * @return
     */
    public void delete(T obj) throws E;

    /**
     * Detela todos os dados
     */
    public void deleteMany();

    /**
     * Atualiza um objeto
     *
     * @param obj
     * @return
     */
    public T update(T obj) throws E;

    /**
     * Ler toda a lista de dados
     *
     * @return
     */
    public List<T> findMany();

    /**
     * Encontra um objeto específico pelo id
     *
     * @param id
     * @return
     */
    public T findById(int id) throws E;

}
