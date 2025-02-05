package com.mono.infosender.loaders;

import java.util.Map;

public abstract class AbsLoader<K , V> implements Loader {
    Map<K , V> bukkit = getBukkit();

    @Override
    public Map<K , V> getBukkit() {
        return bukkit;
    }
}
