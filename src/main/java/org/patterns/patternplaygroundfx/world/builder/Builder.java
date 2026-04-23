package org.patterns.patternplaygroundfx.world.builder;

import org.patterns.patternplaygroundfx.world.GameMap;

public interface Builder {
    void buildSize();
    void buildBase();
    void buildDetails();
    void reset();
    GameMap getResult();

}
