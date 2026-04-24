package org.patterns.patternplaygroundfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.patterns.patternplaygroundfx.Player.Player;
import org.patterns.patternplaygroundfx.prototype.enemies.EnemyPrototype;
import org.patterns.patternplaygroundfx.registry.Level.LevelContext;
import org.patterns.patternplaygroundfx.registry.Level.LevelHome;
import org.patterns.patternplaygroundfx.world.flyweight.PlayerMeta;

public class main extends Application {

    private static final int TILE_SIZE = 20;


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

        Player player = Player.getInstance(new PlayerMeta("Raz", Color.AQUAMARINE, 100, "Gold", "100"));
        player.setLocation(10, 20);


        Canvas canvas = new Canvas(720, 720);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        if (stage1.getMap() != null) {
            stage1.getMap().drawObject(gc, TILE_SIZE);
        }
        for (EnemyPrototype enemy : stage1.getEnemies()) {
            enemy.render(gc, TILE_SIZE);
        }

        for (EnemyPrototype npc : stage1.getNpc()) {
            npc.render(gc, 20);
        }

        player.render(gc, TILE_SIZE);

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.setTitle(stage1.getTitle());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}