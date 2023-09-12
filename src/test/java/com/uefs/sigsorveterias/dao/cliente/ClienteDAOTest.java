package com.uefs.sigsorveterias.dao.cliente;

import com.uefs.sigsorveterias.dao.DAO;
import com.uefs.sigsorveterias.model.Cliente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteDAOTest {

    Cliente joao;
    Cliente junior;
    Cliente maria;

    /**
     * Executa ANTES de cada teste
     */
    @BeforeEach
    void setUp() {
        joao = DAO.getClienteDAO().create(new Cliente("João", "123456"));
        junior = DAO.getClienteDAO().create(new Cliente("Junior", "789456"));
        maria = DAO.getClienteDAO().create(new Cliente("Maria", "741852"));
    }

    /**
     * Executa DEPOIS de cada teste
     */
    @AfterEach
    void tearDown() {
        DAO.getClienteDAO().deleteMany();
    }

    @Test
    void create() {
        Cliente esperado = new Cliente(3, "Rafael", "79985223");
        Cliente atual = DAO.getClienteDAO().create(new Cliente("Rafael", "79985223"));

        assertEquals(esperado, atual);
    }

    @Test
    void delete() {
        DAO.getClienteDAO().delete(junior);
        int tamanho_esperado = 2;
        assertEquals(tamanho_esperado, DAO.getClienteDAO().findMany().size());
    }

    @Test
    void deleteMany() {
        DAO.getClienteDAO().deleteMany();
        assertEquals(0, DAO.getClienteDAO().findMany().size());
    }

    @Test
    void update() {
        maria.setNome("Maria da Silva");
        maria.setCpf("111222334456");
        Cliente atual = DAO.getClienteDAO().update(maria);
        assertEquals(maria, atual);
    }

    @Test
    void findMany() {
        DAO.getClienteDAO().findMany();
        assertEquals(3, DAO.getClienteDAO().findMany().size());
    }

    @Test
    void findById() {
        Cliente esperado = new Cliente(1, "Junior", "789456");
        Cliente atual = DAO.getClienteDAO().findById(1);
        assertEquals(esperado, atual);
    }
}