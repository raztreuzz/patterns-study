module org.patterns.patternplaygroundfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;
    requires javafx.graphics;

    opens org.patterns.patternplaygroundfx to javafx.fxml;
    exports org.patterns.patternplaygroundfx;
}