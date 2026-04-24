package org.patterns.patternplaygroundfx.world.Factory.ConcretFactories;

import javafx.scene.canvas.GraphicsContext;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;

public interface Map {
    void Generate_floor(MapType mapType);
    void drawObject(GraphicsContext gc,int sizeX,int sizeY);
    void setstate();

}
