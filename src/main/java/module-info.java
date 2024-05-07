module com.empresa.demojavafxyscenebuldier {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.empresa.demojavafxyscenebuldier to javafx.fxml;
    exports com.empresa.demojavafxyscenebuldier;
}