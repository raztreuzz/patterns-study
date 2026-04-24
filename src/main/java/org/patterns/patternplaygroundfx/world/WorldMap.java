package org.patterns.patternplaygroundfx.world;

import javafx.scene.paint.Color;
import org.patterns.patternplaygroundfx.prototype.enemies.EnemyList;
import org.patterns.patternplaygroundfx.prototype.enemies.EnemyPrototype;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.Factory.WorldFactory;
import org.patterns.patternplaygroundfx.world.flyweight.EnemyMeta;
import org.patterns.patternplaygroundfx.world.flyweight.MapType;
import org.patterns.patternplaygroundfx.world.flyweight.NeutralNpcMeta;
import org.patterns.patternplaygroundfx.world.models.enemies.VillagerAdapter;
import org.patterns.patternplaygroundfx.world.models.enemies.legacy.Villager;
import org.patterns.patternplaygroundfx.world.models.enemies.zombie;
import org.patterns.patternplaygroundfx.world.models.maps.HomeMap;

import java.util.HashMap;

public class WorldMap implements WorldFactory {

    private static final HashMap<String, MapType> tileTypes = new HashMap<>();
    private static final String ZOMBIE_BASIC = "ZOMBIE_BASIC";
    private static final String VILLAGER_FOREST = "VILLAGER_BASIC";
    private EnemyList enemyRegistry = new EnemyList();

    public WorldMap() {
        EnemyMeta zombieForest= new EnemyMeta("Zombie",100,Color.DARKRED);
        this.enemyRegistry.register(ZOMBIE_BASIC, new zombie(zombieForest));

        Villager villager = new Villager();
        NeutralNpcMeta villagerData = new NeutralNpcMeta("VILLAGER", Color.DARKGREEN, 50);
        this.enemyRegistry.register(VILLAGER_FOREST, new VillagerAdapter(villager, villagerData));


    }

    @Override
    public Map generate_map() {
        HomeMap map = new HomeMap();
        map.Generate_floor();
        return map;
    }

    @Override
    public EnemyPrototype generateEnemy() {

        EnemyPrototype enemy = enemyRegistry.getClone(ZOMBIE_BASIC);

        return enemy;


    }

    @Override
    public EnemyPrototype generatenpc() {
        EnemyPrototype npc = enemyRegistry.getClone(VILLAGER_FOREST);

        return npc;
    }


    public static MapType getTileType(String name, Color color, boolean solid) {
        if (!tileTypes.containsKey(name)) {
            tileTypes.put(name, new MapType(name, color, solid));
            System.out.println("Flyweight: Creando nuevo tipo de tile -> " + name);
        }
        return tileTypes.get(name);
    }
}