module com.uefs.sigsorveterias {
    requires javafx.controls;
    requires javafx.fxml;

    /**
     * Permite o acesso aos pacotes para os testes de unidade pelo TestSuite
     */
    opens com.uefs.sigsorveterias.dao.cliente;
    opens com.uefs.sigsorveterias.dao.estoque;
    opens com.uefs.sigsorveterias.dao.funcionario;
    opens com.uefs.sigsorveterias.dao.evento;
    opens com.uefs.sigsorveterias.dao.pedido;
    opens com.uefs.sigsorveterias.dao.item_pedido;
    opens com.uefs.sigsorveterias.dao.produto;
    opens com.uefs.sigsorveterias.dao.venda;
    opens com.uefs.sigsorveterias.model;
    /** */

    opens com.uefs.sigsorveterias to javafx.fxml;
    exports com.uefs.sigsorveterias;
}