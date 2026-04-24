package org.patterns.patternplaygroundfx.registry.Level;

import org.patterns.patternplaygroundfx.world.Factory.ConcretFactories.Map;
import org.patterns.patternplaygroundfx.world.WorldMap;

public class LevelContext {


    private String music;
    private Integer time;
    private Boolean FinalBoss;
    private String title;
    private Map map;

    protected LevelContext() {

    }

    public void setMusic(String music) {
        this.music = music;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setFinalBoss(Boolean finalBoss) {
        FinalBoss = finalBoss;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "LevelContext{" +
                "music='" + music + '\'' +
                ", time=" + time +
                ", FinalBoss=" + FinalBoss +
                ", title='" + title + '\'' +
                ", map=" + map +
                '}';
    }
}
