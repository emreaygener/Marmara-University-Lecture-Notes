module com.example.javafxexcercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.javafxexcercise to javafx.fxml;
    exports com.example.javafxexcercise;
}