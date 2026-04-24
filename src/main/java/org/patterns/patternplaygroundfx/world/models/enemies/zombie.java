package org.patterns.patternplaygroundfx.world.models.enemies;

import javafx.scene.canvas.GraphicsContext;
import org.patterns.patternplaygroundfx.prototype.enemies.EnemyPrototype;
import org.patterns.patternplaygroundfx.world.flyweight.EnemyMeta;

public class zombie implements EnemyPrototype {
    private EnemyMeta meta;
    private int x, y;
    private int currentHealth;

    public zombie(EnemyMeta meta) {
        this.meta = meta;
        this.currentHealth = meta.getMaxHealth();
    }

    @Override
    public EnemyPrototype clon() {
        return new zombie(this.meta);
    }

    @Override
    public void name() {

        System.out.println("[Enemy] Respawneando..." + meta.getName());

    }

    @Override
    public void Location(int x, int y) {

        this.x = x;
        this.y = y;

    }

    @Override
    public void Health(int health) {

        this.currentHealth = health;

    }

    @Override
    public void render(GraphicsContext gc, int size) {
        this.meta.drawLocation(gc,this.x,this.y,size);

    }


}
