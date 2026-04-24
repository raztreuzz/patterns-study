package org.patterns.patternplaygroundfx.world.models.enemies;

import javafx.scene.canvas.GraphicsContext;
import org.patterns.patternplaygroundfx.prototype.enemies.EnemyPrototype;
import org.patterns.patternplaygroundfx.world.flyweight.NeutralNpcMeta;
import org.patterns.patternplaygroundfx.world.models.enemies.legacy.Villager;

public class VillagerAdapter implements EnemyPrototype {
    private Villager villager;
    private NeutralNpcMeta meta;
    private int x,y;
    private int CurrentHealth;

    public VillagerAdapter(Villager villager, NeutralNpcMeta meta) {
        this.villager = villager;
        this.meta = meta;
        this.CurrentHealth = meta.getMaxHealth();
        syncLegacyData();

    }

    @Override
    public EnemyPrototype clon() {
        return new VillagerAdapter(new Villager(), this.meta);
    }

    @Override
    public void name() {
        System.out.println("Soy aldeano Legacy adaptado: " + meta.getName());

    }

    @Override
    public void Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void Health(int health) {
        this.CurrentHealth = health;


    }

    @Override
    public void render(GraphicsContext gc, int size) {
        double scale = meta.getBodyScale();
        double actualSize = size * scale;
        double offset = (size - actualSize) / 2;

        double pixelX = (this.x * size) + offset;
        double pixelY = (this.y * size) + offset;

        gc.setFill(meta.getColor());

        villager.drawLegacyNPC(gc, pixelX, pixelY, (int)actualSize);
    }

    private void syncLegacyData() {
        if (this.meta != null && this.villager != null) {
            this.villager.setName(meta.getName());
        }
    }
}
