package org.patterns.patternplaygroundfx.world.models.maps;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.WorldMap;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;

public class HomeMap implements Map {
    private final int width = 36;
    private final int height = 36;
    private MapType[][] matrix_map =  new MapType[width][height];

    @Override
    public void Generate_floor() {

        MapType forest = WorldMap.getTileType("GREEN_Forest",Color.FORESTGREEN,false);

        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                matrix_map [i][j] = forest;
            }
        }
    }

    @Override
    public void drawObject(GraphicsContext gc, int size) {

        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(matrix_map[x][y] != null){
                    matrix_map[x][y].draw(gc,x,y,size);
                }

            }
        }

    }

    @Override
    public void setstate() {

        System.out.println("Home Map");

    }

}
