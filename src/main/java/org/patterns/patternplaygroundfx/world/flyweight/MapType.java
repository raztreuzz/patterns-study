package org.patterns.patternplaygroundfx.world.flyweight;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MapType {
    private final String name;
    private final Color color;
    private final boolean solid;

    public MapType(String name, Color color, boolean solid) {
        this.name = name;
        this.color = color;
        this.solid = solid;
    }

    public void draw(GraphicsContext gc, int x, int y, int size) {
        gc.setFill(this.color);
        gc.fillRect(x * size, y * size, size, size);
    }


}