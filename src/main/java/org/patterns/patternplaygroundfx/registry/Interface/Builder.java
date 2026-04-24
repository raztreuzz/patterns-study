package org.patterns.patternplaygroundfx.registry.Interface;

import org.patterns.patternplaygroundfx.registry.Level.LevelContext;

public interface Builder {
    Builder reset();
    Builder music(String music);
    Builder title(String title);
    Builder time(Integer time);
    Builder FinalBoss(boolean finalBoss);
    Builder map();
    LevelContext build();
}
