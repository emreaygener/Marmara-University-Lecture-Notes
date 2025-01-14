module com.example.obys {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.obys to javafx.fxml;
    exports com.example.obys;
}