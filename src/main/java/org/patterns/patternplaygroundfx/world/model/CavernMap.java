package org.patterns.patternplaygroundfx.world.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import org.patterns.patternplaygroundfx.world.Factory.MapFactory;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;

public class CavernMap {
    private final int size = 36;
    private final MapType[][] matrix = new MapType[size][size];


    public CavernMap() {

        MapType rock = MapFactory.getTileType("rock", Color.SADDLEBROWN,false);

        for(int i= 0;i<size;i++){
            for(int j= 0;j<size;j++){
                matrix[i][j] = rock;
            }
        }

    }

    public void draw(GraphicsContext gc, int tileSize) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j].draw(gc, j, i, tileSize);
            }
        }
    }

    public int getSize() {
        return size;
    }
}