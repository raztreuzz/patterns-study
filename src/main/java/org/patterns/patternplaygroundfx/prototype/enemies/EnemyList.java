package org.patterns.patternplaygroundfx.prototype.enemies;

import java.util.HashMap;
import java.util.Map;

public class EnemyList {
    private Map<String, EnemyPrototype> protoTypes = new HashMap<>();

    public void register(String name, EnemyPrototype prototype) {
        this.protoTypes.put(name, prototype);

    }

    public EnemyPrototype getClone(String name) {
        EnemyPrototype proto = protoTypes.get(name);
        if (proto == null) {
            System.out.println("Error: El prototipo " + name + " no existe.");
            return null;
        }
        return proto.clon();
    }


}
