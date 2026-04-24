package org.patterns.patternplaygroundfx.registry;

import org.patterns.patternplaygroundfx.world.WorldMap;

public class LevelContext {

    private WorldMap worldMap;
    private String music;
    private Integer time;
    private Boolean FinalBoss;
    private String title;

    protected LevelContext() {

    }

    public void setWorldMap(WorldMap worldMap) {
        this.worldMap = worldMap;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFinalBoss(Boolean finalBoss) {
        FinalBoss = finalBoss;
    }

    @Override
    public String toString() {
        return "LevelContext{" +
                "worldMap=" + worldMap +
                ", music='" + music + '\'' +
                ", time=" + time +
                ", FinalBoss=" + FinalBoss +
                ", title='" + title + '\'' +
                '}';
    }

}
