module com.snakes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.snakes to javafx.fxml;
    exports com.snakes;
}