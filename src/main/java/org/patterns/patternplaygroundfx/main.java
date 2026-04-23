package org.patterns.patternplaygroundfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.patterns.patternplaygroundfx.world.model.CavernMap;

public class main extends Application {

    @Override
    public void start(Stage stage) {
        CavernMap map = new CavernMap();
        final int size = map.getSize();


        int canvasSize = size * size;
        Canvas canvas = new Canvas(canvasSize, canvasSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        map.draw(gc, size);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        stage.setTitle("Mining Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}