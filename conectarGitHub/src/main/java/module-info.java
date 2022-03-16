module com.mycompany.conectargithub {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.conectargithub to javafx.fxml;
    exports com.mycompany.conectargithub;
}
