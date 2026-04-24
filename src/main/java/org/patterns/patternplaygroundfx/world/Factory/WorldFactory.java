package org.patterns.patternplaygroundfx.world.Factory;


import org.patterns.patternplaygroundfx.prototype.enemies.EnemyPrototype;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;

public interface WorldFactory {
    Map generate_map();
    EnemyPrototype generateEnemy();
    EnemyPrototype generatenpc();
}
