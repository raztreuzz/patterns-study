package org.patterns.patternplaygroundfx.world.flyweight;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PlayerMeta {
    private String name;
    private int maxHealth;
    private Color color;
    private String ores;
    private String Damage;


    public PlayerMeta(String name, Color color, int maxHealth, String ores, String damage) {
        this.name = name;
        this.color = color;
        this.maxHealth = maxHealth;
        this.ores = ores;
        Damage = damage;
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

    public String getOres() {
        return ores;
    }

    public String getDamage() {
        return Damage;
    }

    public void draw(GraphicsContext gc, int x, int y, int size) {
        gc.setFill(this.color);

        double[] xPoints = {
                x * size + size / 2.0,
                x * size + 2,
                x * size + size - 2
        };
        double[] yPoints = {
                y * size + 2,
                y * size + size - 2,
                y * size + size - 2
        };

        gc.fillPolygon(xPoints, yPoints, 3);

        gc.setStroke(Color.WHITE);
        gc.setLineWidth(1);
        gc.strokePolygon(xPoints, yPoints, 3);
    }
    private void setCheckpoint(){
        System.out.println("set checkpoint");
    }

}
