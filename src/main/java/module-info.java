module com.uefs.sigsorveterias {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uefs.sigsorveterias to javafx.fxml;
    exports com.uefs.sigsorveterias;
}