package org.patterns.patternplaygroundfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.patterns.patternplaygroundfx.registry.Level.LevelContext;
import org.patterns.patternplaygroundfx.registry.Level.LevelHome;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.WorldMap;

public class main extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        LevelHome builder = new LevelHome();

        LevelContext stage1 = builder.reset()
                .title("Level 0: The Forest")
                .music("forest_theme.mp3")
                .time(300)
                .FinalBoss(false)
                .map()
                .build();


        Canvas canvas = new Canvas(720, 720);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        if (stage1.getMap() != null) {
            stage1.getMap().drawObject(gc, 36);
        }

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.setTitle(stage1.getTitle());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}