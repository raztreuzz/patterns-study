package org.patterns.patternplaygroundfx.world.flyweight;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class EnemyMeta {

    private final String name;
    private final int maxHealth;
    private final Color color;
    private final double bodyScale = 0.8;

    public EnemyMeta(String name, int maxHealth, Color color) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.color = color;
    }



    public void drawLocation(GraphicsContext gc, int x, int y, int size) {
        double actualSize = size * this.bodyScale;
        double offset = (size - actualSize) / 2;

        gc.setFill(this.color);
        gc.fillOval(x * size + offset, y * size + offset, actualSize, actualSize);
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public Color getColor() {
        return color;
    }
}
