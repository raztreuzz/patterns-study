package org.patterns.patternplaygroundfx.registry.Level;

import org.patterns.patternplaygroundfx.prototype.enemies.EnemyPrototype;
import org.patterns.patternplaygroundfx.registry.Interface.Builder;
import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.WorldMap;

public class LevelHome implements Builder {

    private LevelContext context;


    @Override
    public Builder reset() {
        context = new LevelContext();
        return this;
    }

    @Override
    public Builder music(String music) {
        context.setMusic(music);
        return this;
    }

    @Override
    public Builder title(String title) {
        context.setTitle(title);
        return this;
    }

    @Override
    public Builder time(Integer time) {
        context.setTime(time);
        return this;
    }

    @Override
    public Builder FinalBoss(boolean finalBoss) {
        context.setFinalBoss(finalBoss);
        return this;
    }

    @Override
    public Builder map() {
        WorldMap factory = new WorldMap();
        Map generatedmap = factory.generate_map();
        context.setMap(generatedmap);

        for (int i = 0; i < 5; i++) {
            EnemyPrototype zombie = factory.generateEnemy();
            if (zombie == null) {
                continue;
            }
            zombie.Location(i * 5, 10);
            context.addEnemy(zombie);

        }

        for (int i = 0; i < 7; i++) {
            EnemyPrototype npc = factory.generatenpc();

            if (npc != null) {
                npc.Location(i * 5, 5);
                context.addnpc(npc);
            }
        }

        return this;
    }

    @Override
    public LevelContext build() {
        return context;
    }
}
