package org.patterns.patternplaygroundfx.world.Factory.ConcretFactories;

import javafx.scene.canvas.GraphicsContext;

public interface Map {
    void Generate_floor( );
    void drawObject(GraphicsContext gc,int size
    );
    void setstate();

}
