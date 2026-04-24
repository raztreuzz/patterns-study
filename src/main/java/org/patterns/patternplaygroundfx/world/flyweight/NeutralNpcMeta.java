package org.patterns.patternplaygroundfx.world.flyweight;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class NeutralNpcMeta {
    private String name;
    private Color color;
    private int MaxHealth;
    private final double bodyScale = 0.7;

    public NeutralNpcMeta(String name, Color color, int maxHealth) {
        this.name = name;
        this.color = color;
        MaxHealth = maxHealth;
    }

    public double getBodyScale() {
        return bodyScale;
    }

    public String getName() {
        return name;
    }



    public Color getColor() {
        return color;
    }

    public int getMaxHealth() {
        return MaxHealth;
    }

    public void draw(GraphicsContext gc, int gridX, int gridY, int size) {

        double actualSize = size * this.bodyScale;
        double offset = (size - actualSize) / 2;


        gc.setFill(this.color);
        gc.fillRect(gridX * size + offset, gridY * size + offset, actualSize, actualSize);

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        gc.strokeRect(gridX * size + offset, gridY * size + offset, actualSize, actualSize);
    }
}
