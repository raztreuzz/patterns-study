package org.patterns.patternplaygroundfx.world.models.enemies.legacy;

import javafx.scene.canvas.GraphicsContext;

public class Villager {
    private String name;

    public void drawLegacyNPC(GraphicsContext gc, double pixelX, double pixelY, double scale) {
        gc.fillRect(pixelX, pixelY, scale, scale);
    }

    public void setName(String name) {
        this.name = name;
    }


}
