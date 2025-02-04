package com.mono.infosender.loaders;

public interface Loader<T> {
    void load();
    T getBukkit();
}
