package com.mono.infosender.loaders;

import java.util.ArrayList;

public abstract class AbsLoader<T> implements Loader {
    ArrayList<T> bukkit = getBukkit();

    @Override
    public ArrayList<T> getBukkit() {
        return bukkit;
    }
}
