package org.patterns.patternplaygroundfx.world.models.maps;

import javafx.scene.paint.Color;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;

public class HomeMap implements Map {
    private MapType mapType;
    private int width;
    private int height;

    @Override
    public void Generate_floor(MapType mapType) {
        mapType = new MapType("GREEN", Color.FORESTGREEN, false);
    }



}
