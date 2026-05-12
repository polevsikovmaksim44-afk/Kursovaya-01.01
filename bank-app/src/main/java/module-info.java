module ru.zelmex.bankapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ru.zelmex.bankapp to javafx.fxml;
    exports ru.zelmex.bankapp;
}