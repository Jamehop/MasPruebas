module DI.JavaFX {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens Controllers to javafx.fxml;
    exports Controllers;
}
