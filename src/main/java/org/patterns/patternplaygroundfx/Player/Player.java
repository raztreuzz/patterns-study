package org.patterns.patternplaygroundfx.Player;

import javafx.scene.canvas.GraphicsContext;
import org.patterns.patternplaygroundfx.world.flyweight.PlayerMeta;

public class Player {
    private static Player instance;
    private PlayerMeta meta;
    private int x,y;
    private int CurrentHealth;

    private Player(PlayerMeta meta) {
        this.meta = meta;
        this.CurrentHealth = meta.getMaxHealth();

    }

    public static Player getInstance(PlayerMeta meta) {
        if (meta == null) {
            throw new IllegalArgumentException("PlayerMeta no puede ser null al inicializar el singleton");
        }
        if (instance == null) {
            instance = new Player(meta);
        }
        return instance;
    }

    public static Player getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Player singleton no inicializado. Llama getInstance(PlayerMeta) primero.");
        }
        return instance;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render(GraphicsContext gc,int size) {
        if (gc == null || size <= 0 || this.meta == null) {
            return;
        }
        this.meta.draw(gc,this.x,this.y,size);
    }

}
