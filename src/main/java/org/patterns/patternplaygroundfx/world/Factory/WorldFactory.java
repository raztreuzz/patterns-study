package org.patterns.patternplaygroundfx.world.Factory;


import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;

public interface WorldFactory {
    Map generate_map();
}
