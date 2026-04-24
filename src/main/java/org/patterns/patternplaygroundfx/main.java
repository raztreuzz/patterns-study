package org.patterns.patternplaygroundfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.WorldMap;

public class main extends Application {
    private Map map;



    @Override
    public void start(Stage stage) throws Exception {
        WorldMap wm = new WorldMap();
        this.map = wm.generate_map();

        Canvas canvas = new Canvas(720, 720);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        this.map.drawObject(gc,36);

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}