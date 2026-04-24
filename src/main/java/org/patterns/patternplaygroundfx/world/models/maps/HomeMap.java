package org.patterns.patternplaygroundfx.world.models.maps;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;

public class HomeMap implements Map {


    @Override
    public void Generate_floor(MapType mapType) {
        mapType = new MapType("GREEN", Color.FORESTGREEN, false);
    }

    @Override
    public void drawObject(GraphicsContext gc, int sizeX, int sizeY) {


    }

    @Override
    public void setstate() {

        System.out.println("Home Map");

    }


}
