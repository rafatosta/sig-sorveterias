package com.uefs.sigsorveterias.model;

public class Venda {

    private int id;

    private Pedido pedido;

    private String data;

    private Funcionario funcionario;


    public Venda(Pedido pedido, String data, Funcionario funcionario) {
        this.pedido = pedido;
        this.data = data;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getData() {
        return data;
    }

    public Cliente getCliente(){
        return this.getPedido().getCliente();
    }

    public void setData(String data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "\n" + pedido +
                ",\n data='" + data + '\'' +
                ",\n " + funcionario +
                "\n}";
    }
}
