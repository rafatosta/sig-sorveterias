package com.uefs.sigsorveterias;

import com.uefs.sigsorveterias.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication /*extends Application*/ {
    /*@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/

    public static void main(String[] args) {
        //launch();
        Cliente c = new Cliente("Rafael", "12345");
        Funcionario f = new Funcionario("João", "jj123", "0000");

        Produto prod = new Produto("Sorvete de Chocolate", 10.00, 100);
        Produto prod2 = new Produto("Picolé de morango", 5.00, 50);

        Pedido p = new Pedido(c);
        ItemPedido ip1 = new ItemPedido(prod, 2);
        ItemPedido ip2 = new ItemPedido(prod2, 5);

        p.addItem(ip1);
        p.addItem(ip2);

        System.out.println(p);

        p.removerItem(ip2);
        System.out.println(p);

        Venda newVenda = new Venda(p, "29/08/2023", f);
        System.out.println(newVenda);


    }
}