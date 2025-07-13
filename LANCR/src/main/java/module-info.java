module com.example.lancr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;

    opens com.example.lancr to javafx.fxml;
    exports com.example.lancr;
}