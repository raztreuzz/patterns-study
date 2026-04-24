package org.patterns.patternplaygroundfx.prototype.enemies;

import javafx.scene.canvas.GraphicsContext;

public interface EnemyPrototype {
    EnemyPrototype clon();
    void name();
    void Location(int x, int y);
    void Health(int health);
    void render(GraphicsContext gc, int size);

}
