package org.patterns.patternplaygroundfx.world;

import javafx.scene.paint.Color;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.Factory.WorldFactory;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;
import org.patterns.patternplaygroundfx.world.models.maps.HomeMap;
import java.util.HashMap;

public class WorldMap implements WorldFactory {

    private static final HashMap<String, MapType> tileTypes = new HashMap<>();


    @Override
    public Map generate_map() {
        HomeMap map = new HomeMap();
        map.Generate_floor();
        return map;
    }


    public static MapType getTileType(String name, Color color, boolean solid) {
        if (!tileTypes.containsKey(name)) {
            tileTypes.put(name, new MapType(name, color, solid));
            System.out.println("Flyweight: Creando nuevo tipo de tile -> " + name);
        }
        return tileTypes.get(name);
    }
}