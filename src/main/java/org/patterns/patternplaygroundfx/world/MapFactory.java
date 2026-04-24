package org.patterns.patternplaygroundfx.world;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.paint.Color;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;

public class MapFactory {
    private static final Map<String, MapType> tileTypes = new HashMap<>();

    public static MapType getTileType(String name, Color color, boolean solid) {

        return tileTypes.computeIfAbsent(name,n -> new MapType(n,color,solid));

    }
}
